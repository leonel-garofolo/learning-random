package com.java8.app.interfaces;

import org.junit.Assert;
import org.junit.Test;

import com.java8.app.interfaces.model.Car;
import com.java8.app.interfaces.model.MotorHome;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

	@Test
	public void getVehicle() {
		final Car carPojo = new Car("PEUGEOT", "WEQW00022");
		carPojo.setWork(false);
		VehicleInterface car = VehicleFactory.getVehicle(VehicleFactory.Vehicles.CAR);
		Assert.assertFalse(car.isWorking(carPojo));

		VehicleInterface motorHome = VehicleFactory.getVehicle(VehicleFactory.Vehicles.MOTORHOME);
		Assert.assertTrue(motorHome.isWorking(new MotorHome("MERCEDES", "UUIO0022")));
	}
}