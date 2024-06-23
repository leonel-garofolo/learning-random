package com.delivery.authenticator.application;

import com.delivery.authenticator.domain.User;
import com.delivery.authenticator.infraestructure.UserRepository;
import com.delivery.authenticator.usercase.CreateUserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserAccountImpl implements CreateUserAccount {

  @Autowired
  UserRepository userRepository;

  public void create(User user) {
    userRepository.create(user);
  }
}
