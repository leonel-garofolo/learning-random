package com.multicaching.app.domain;

import java.sql.Timestamp;
import java.util.UUID;

import lombok.Data;

@Data
public class OrderItemDomain {

  private UUID id;

  private Timestamp created;

  private int quantity;

  private ProductDomain productDomain;

}
