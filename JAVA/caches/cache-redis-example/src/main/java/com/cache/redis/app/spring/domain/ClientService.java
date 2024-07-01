package com.cache.redis.app.spring.domain;

import com.cache.redis.app.spring.domain.model.Client;

public interface ClientService {

  void save(Client client);

  Client get(String id);

  Iterable<Client> findAll();

  void clear();

}
