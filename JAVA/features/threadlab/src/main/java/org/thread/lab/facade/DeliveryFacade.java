package org.thread.lab.facade;

import org.thread.lab.model.Delivery;

import java.util.Collection;
import java.util.UUID;

public interface DeliveryFacade {

	Collection<Delivery> findAll();

	Delivery find(UUID uuid);

	Delivery insert(Delivery delivery);

	boolean update(Delivery delivery);

	boolean delete(UUID uuid);

}
