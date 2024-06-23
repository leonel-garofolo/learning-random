package com.multicaching.app.domain;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class OrderDomain {

  private UUID id;

  private Timestamp created;

  private List<OrderItemDomain> orderItemEntities;

  private double totalAmount = 0;

  public void addItem(OrderItemDomain orderItemDomain) {
    orderItemEntities.add(orderItemDomain);
    totalAmount = orderItemEntities.stream().mapToDouble(item -> item.getQuantity() * item.getProductDomain().getPrice())
        .sum();
  }

}
