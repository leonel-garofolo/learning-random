package com.cache.redis.app.spring.application;

import java.util.List;

import com.cache.redis.app.spring.domain.application.FindAllClientUserCase;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import com.cache.redis.app.spring.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindAllClientUserCaseImpl implements FindAllClientUserCase {

  @Autowired
  private ClientRepositoryDecorator clientRepositoryDecorator;

  @Override
  public List<Client> handle(Void nothingToDo) {
    return clientRepositoryDecorator.findAll();
  }
}
