package com.java8.app.interfaces;

import com.java8.app.interfaces.model.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface VehicleInterface {
	Logger LOGGER = LoggerFactory.getLogger(VehicleInterface.class);

	default void start(){
		LOGGER.debug("the car is starting");
	}

	default void stop(){
		LOGGER.debug("the car is stop");
	}

	default Boolean isWorking(Vehicle vehicle){
		return true;
	}

}
