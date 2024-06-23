package com.delivery.authenticator.infrastructure.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class UserDao {

  @Id
  private String id;

  private String name;

  private String address;

  private String username;

  private String passwork;

}
