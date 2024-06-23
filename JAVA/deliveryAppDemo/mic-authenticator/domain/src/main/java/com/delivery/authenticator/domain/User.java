package com.delivery.authenticator.domain;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

  private String id;

  private String username;

  private String passwork;

  private String name;

  private String address;

}
