package com.patterns.solid.isp;

import java.util.List;


interface DeliveryRepository {
	void save(Delivery delivery);

	/**
	 * Violate ISP, we are definating a method to the client that is relational with how implement it.
	 * Specifically when we use the method save
	 * @param delivery
	 */
	void flush(Delivery delivery);

	void saveAll(List<Delivery> deliveries);

	Delivery search(DerliveryId id);

	List<Delivery> all();
}