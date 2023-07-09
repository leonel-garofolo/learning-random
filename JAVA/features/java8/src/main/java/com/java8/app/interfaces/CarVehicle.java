package com.java8.app.interfaces;

import com.java8.app.interfaces.model.Vehicle;

public class CarVehicle implements VehicleInterface {

	@Override
	public Boolean isWorking(Vehicle car) {
		return car.isWork();
	}
}
