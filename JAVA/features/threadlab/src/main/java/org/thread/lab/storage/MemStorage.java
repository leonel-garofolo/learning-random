package org.thread.lab.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thread.lab.model.Delivery;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class MemStorage {
	private final static Logger LOGGER = LoggerFactory.getLogger(MemStorage.class);

	private final static HashMap<UUID, Delivery> STORAGE = new HashMap<>();

	public static Collection<Delivery> findAll() {
		return STORAGE.values();
	}

	public static Delivery find(UUID uuid) {
		return STORAGE.get(uuid);
	}

	public static Delivery insert(Delivery delivery) {
		LOGGER.info("insert {}", delivery);
		return STORAGE.put(delivery.getId(), delivery);
	}

	public static synchronized boolean update(Delivery delivery) {
		try{
			Thread.sleep(1000);
			LOGGER.info("update {}", delivery);
			delete(delivery.getId());
			STORAGE.put(delivery.getId(), delivery);
		} catch (Exception e){
			return false;
		}
		return true;
	}

	public static boolean delete(UUID uuid) {
		try{
			STORAGE.remove(uuid);
		} catch (Exception e){
			return false;
		}
		return true;
	}
}
