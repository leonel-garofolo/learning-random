package com.cache.redis.app.spring.application;

import com.cache.redis.app.spring.domain.application.UpdateClientUserCase;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import com.cache.redis.app.spring.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateClientUserCaseImpl implements UpdateClientUserCase {

  @Autowired
  private ClientRepositoryDecorator clientRepositoryDecorator;

  @Override
  public Boolean handle(Client client) {
    if (client.getId() == null) {
      throw new IllegalArgumentException(String.format("Can't update client by id not found %s", client));
    }

    clientRepositoryDecorator.save(client);
    return Boolean.TRUE;
  }
}
