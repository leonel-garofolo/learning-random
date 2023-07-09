package com.java8.app.interfaces;

public class VehicleFactory {

	public static VehicleInterface getVehicle(final Vehicles vehicle) {
		if (vehicle == Vehicles.CAR) {
			return new CarVehicle();
		}

		return new MotorHomeVehicle();
	}

	enum Vehicles {
		CAR,
		MOTORHOME
	}
}
