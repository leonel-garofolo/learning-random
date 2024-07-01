package com.cache.redis.app.spring.application;

import com.cache.redis.app.spring.domain.application.RemoveClientUserCase;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveClientUserCaseImpl implements RemoveClientUserCase {

  @Autowired
  private ClientRepositoryDecorator clientRepositoryDecorator;

  @Override
  public Boolean handle(String id) {
    clientRepositoryDecorator.remove(id);
    return Boolean.TRUE;
  }
}
