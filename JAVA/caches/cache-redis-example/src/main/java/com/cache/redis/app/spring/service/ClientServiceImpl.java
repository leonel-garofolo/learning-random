package com.cache.redis.app.spring.service;

import java.util.List;

import com.cache.redis.app.spring.domain.model.Client;
import com.cache.redis.app.spring.domain.ClientService;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientRepositoryDecorator clientRepositoryDecorator;

  @Override
  public void save(Client client) {
    clientRepositoryDecorator.save(client);
  }

  @Override
  public Client get(String id) {
    return clientRepositoryDecorator.findById(id).orElse(null);
  }

  public List<Client> findAll() {
    return clientRepositoryDecorator.findAll();
  }

  public void clear() {
    clientRepositoryDecorator.deleteAll();
  }
}
