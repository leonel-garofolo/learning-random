package com.cache.redis.app.spring.application;

import java.util.Optional;

import com.cache.redis.app.spring.domain.application.FindClientByIdUserCase;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import com.cache.redis.app.spring.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindClientByIdUserCaseImpl implements FindClientByIdUserCase {

  @Autowired
  private ClientRepositoryDecorator clientRepositoryDecorator;

  @Override
  public Optional<Client> handle(String id) {
    if (id == null) {
      throw new IllegalArgumentException("Id is null");
    }

    return clientRepositoryDecorator.findById(id);
  }
}
