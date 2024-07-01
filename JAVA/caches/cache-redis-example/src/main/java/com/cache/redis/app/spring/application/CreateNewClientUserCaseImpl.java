package com.cache.redis.app.spring.application;

import com.cache.redis.app.spring.domain.application.CreateNewClientUserCase;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import com.cache.redis.app.spring.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateNewClientUserCaseImpl implements CreateNewClientUserCase {

  @Autowired
  private ClientRepositoryDecorator clientRepositoryDecorator;

  @Override
  public Client handle(Client client) {
    if (client == null) {
      throw new IllegalArgumentException("Client is null");
    }
    clientRepositoryDecorator.save(client);
    return client;
  }
}
