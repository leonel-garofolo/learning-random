package com.delivery.authenticator.infrastructure;

import com.delivery.authenticator.domain.User;
import com.delivery.authenticator.infraestructure.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootConfiguration
@ComponentScan
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
public class UserRepositoryIT {

  @Autowired
  private UserRepository userRepository;

  @Test
  public void createUserTest() {
    User user = User.builder()
        .username("leoneleg")
        .passwork("asdwq")
        .address("Av Neptuno 22")
        .build();
    Assert.assertTrue(userRepository.create(user));

  }
}
