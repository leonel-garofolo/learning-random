package com.delivery.authenticator.apirest;

import com.delivery.authenticator.apirest.dto.UserDTO;
import com.delivery.authenticator.domain.User;
import com.delivery.authenticator.usercase.CreateUserAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/account")
public class UserController implements UsersApi{

  @Autowired
  private CreateUserAccount createUserAccount;

  @PostMapping("/create")
  public void create(@RequestBody UserDTO userDTO) {
    User user = User.builder()
        //.passwork(userDTO.getPassword())
        .address(userDTO.getAddress())
        .build();
    createUserAccount.create(user);
  }
}
