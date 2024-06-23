package com.multicaching.app.infraestructure;

import com.multicaching.app.domain.service.OrderDomainService;
import com.multicaching.app.infraestructure.repository.OrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    OrderService orderService(OrderRepository orderRepository) {
        return new OrderDomainService(orderRepository);
    }
}