package com.cache.redis.app.spring.domain.infrastructure;

import java.util.List;
import java.util.Optional;

import com.cache.redis.app.spring.domain.model.Client;

public interface ClientRepositoryDecorator {

  Optional<Client> findById(String id);

  void save(Client client);

  void remove(String id);

  List<Client> findAll();

  void deleteAll();
}
