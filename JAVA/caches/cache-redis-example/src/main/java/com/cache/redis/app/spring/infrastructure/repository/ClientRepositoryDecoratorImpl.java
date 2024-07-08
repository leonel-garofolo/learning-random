package com.cache.redis.app.spring.infrastructure.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import com.cache.redis.app.spring.domain.model.Client;
import com.cache.redis.app.spring.infrastructure.outbound.ClientEmailEvent;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientCache;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientDao;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientJpaRepository;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientMapper;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientRedisRepository;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClientRepositoryDecoratorImpl implements ClientRepositoryDecorator {

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  private final Cache<String, Client> cache = Caffeine.newBuilder().build();

  @Autowired
  private ClientMapper clientMapper;

  @Autowired
  private ClientRedisRepository clientRedisRepository;

  @Autowired
  private ClientJpaRepository clientJpaRepository;

  @Override
  public void save(Client client) {
    ClientDao clientDao = clientMapper.asClientDao(client);
    if (client.getId() != null) {
      long currentTimeMillis = System.currentTimeMillis();
      Date timestamp = new Date(currentTimeMillis);
      final Optional<ClientDao> clientFound = clientJpaRepository.findById(client.getId());
      clientFound.ifPresent(dao -> clientDao.setCreated(dao.getCreated()));
      clientDao.setUpdated(timestamp);
    } else {
      ClientEmailEvent clientEmailEvent = ClientEmailEvent.builder()
              .name(client.getName())
              .build();
      applicationEventPublisher.publishEvent(clientEmailEvent);
    }

    final ClientDao clientPersisted = clientJpaRepository.save(clientDao);
    client.setId(clientPersisted.getId());
    cache.put(clientPersisted.getId(), client);
    clientRedisRepository.save(clientMapper.asClientCache(client));
    log.info("Client was saved[Client:{}]", client);
  }

  @Override
  public void remove(String id) {
    clientJpaRepository.deleteById(id);
    Client client = cache.getIfPresent(id);
    if (client != null) {
      log.info("remove from cache[Client:{}]", client);
      cache.invalidate(client.getId());
    }
    Optional<ClientCache> clientCacheFound = clientRedisRepository.findById(id);
    if (clientCacheFound.isPresent()) {
      log.info("remove from REDIS[ClientCache:{}]", clientCacheFound);
      clientRedisRepository.deleteById(id);
    }
  }

  @Override
  public Optional<Client> findById(String id) {
    Optional<Client> client = Optional.ofNullable(cache.getIfPresent(id));
    log.info("client is found in Local cache[{}]", client);
    if (!client.isPresent()) {
      Optional<ClientCache> clientCache = clientRedisRepository.findById(id);
      log.info("client is found in Redis[{}]", clientCache);
      if (clientCache.isPresent()) {
        cache.put(id, clientMapper.asClient(clientCache.get()));
      } else {
        final Optional<ClientDao> clientDao = clientJpaRepository.findById(id);
        log.info("client is found in Database[{}]", clientDao);
        if (clientDao.isPresent()) {
          ClientCache clientCacheFromDao = clientMapper.asClientCache(clientDao.get());
          clientRedisRepository.save(clientCacheFromDao);
          client = Optional.of(clientMapper.asClient(clientCacheFromDao));
          cache.put(id, client.get());
        }
      }
    }
    return client;
  }

  @Override
  public List<Client> findAll() {
    List<Client> clientsInCache = new ArrayList<>(cache.asMap().values());
    if (!clientsInCache.isEmpty()) {
      return clientsInCache;
    }
    log.info("client not found in cache");

    List<ClientCache> clientsInRedis = (List<ClientCache>) clientRedisRepository.findAll();
    if (!clientsInRedis.isEmpty()) {
      clientsInCache = clientMapper.asClient(clientsInRedis);
      cache.putAll(clientsInCache.stream().collect(Collectors.toMap(Client::getId, client -> client)));
      return clientsInCache;
    }
    log.info("client not found in Redis");

    return new ArrayList<>(cache.asMap().values());
  }

  @Override
  public void deleteAll() {
    cache.cleanUp();

  }
}
