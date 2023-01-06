package org.thread.lab.facade;

import org.thread.lab.model.Delivery;
import org.thread.lab.storage.MemStorage;

import java.util.Collection;
import java.util.UUID;

public class DeliveryFacadeImpl implements DeliveryFacade{

	@Override
	public Collection<Delivery> findAll() {
		return MemStorage.findAll();
	}

	@Override
	public Delivery find(UUID uuid) {
		return MemStorage.find(uuid);
	}

	@Override
	public Delivery insert(Delivery delivery) {
		return MemStorage.insert(delivery);
	}

	@Override
	public boolean update(Delivery delivery) {
		return MemStorage.update(delivery);
	}

	@Override
	public boolean delete(UUID uuid) {
		return MemStorage.delete(uuid);
	}
}
