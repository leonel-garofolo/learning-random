package com.multicaching.app.domain.service;

import com.multicaching.app.infraestructure.OrderService;
import com.multicaching.app.infraestructure.repository.OrderRepository;

public class OrderDomainService implements OrderService {

  public OrderDomainService(OrderRepository orderRepository) {
  }
}
