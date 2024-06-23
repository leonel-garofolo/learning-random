package com.multicaching.app.domain;

import java.sql.Timestamp;
import java.util.UUID;

import lombok.Data;

@Data
public class ProductDomain {

  private UUID id;

  private Timestamp created;

  private String name;

  private double price = 0;

}
