package com.delivery.authenticator.infrastructure;

import java.util.UUID;

import com.delivery.authenticator.domain.User;
import com.delivery.authenticator.infraestructure.UserRepository;
import com.delivery.authenticator.infrastructure.dao.UserDao;
import com.delivery.authenticator.infrastructure.jpa.UserJPARepository;
import com.delivery.authenticator.infrastructure.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserRepositoryImpl implements UserRepository {

  @Autowired
  UserJPARepository userJPARepository;

  @Override
  public boolean create(User user) {
    user.setId(UUID.randomUUID().toString());
    UserDao userDao = UserMapper.INSTANCE.fromUserToUserDao(user);
    log.info("save {}", userDao);
    userJPARepository.save(userDao);

    return true;
  }
}
