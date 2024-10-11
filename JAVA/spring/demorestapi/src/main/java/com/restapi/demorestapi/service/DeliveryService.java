package com.restapi.demorestapi.service;


import com.restapi.demorestapi.model.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {

	List<Delivery> findAll();

	Optional<Delivery> findById(Long id);

	void save(Delivery Delivery);
	Boolean delete(Delivery Delivery);
}
