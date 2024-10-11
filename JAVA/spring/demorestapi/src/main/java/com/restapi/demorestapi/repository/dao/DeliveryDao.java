package com.restapi.demorestapi.repository.dao;

import com.restapi.demorestapi.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDao extends CrudRepository<Delivery, Long> {
}
