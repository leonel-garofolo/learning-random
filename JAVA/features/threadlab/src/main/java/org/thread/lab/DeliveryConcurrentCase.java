package org.thread.lab;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thread.lab.facade.DeliveryFacade;
import org.thread.lab.facade.DeliveryFacadeImpl;
import org.thread.lab.model.Delivery;
import org.thread.lab.utils.LogProperty;

import java.util.Properties;

public class DeliveryConcurrentCase implements Runnable {
	private final static Logger LOGGER = LoggerFactory.getLogger(DeliveryConcurrentCase.class);


	public static void main(String[] args) {
		LogProperty.upConfiguration();

		Thread thread1 = new Thread(new DeliveryConcurrentCase());
		thread1.start();
		Thread thread2 = new Thread(new DeliveryConcurrentCase());
		thread2.start();
		Thread thread3 = new Thread(new DeliveryConcurrentCase());
		thread3.start();
	}

	private final DeliveryFacade deliveryFacade;

	public DeliveryConcurrentCase() {
		this.deliveryFacade = new DeliveryFacadeImpl();
	}

	@Override
	public void run() {
		LOGGER.info("start run");
		final Delivery delivery = newInstance();
		this.deliveryFacade.insert(delivery);

		delivery.setAddress("Myaddress2");
		this.deliveryFacade.update(delivery);
	}

	private Delivery newInstance(){
		return new Delivery("MyAddress");
	}
}
