package com.java8.app.interfaces.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Vehicle {

	private final String model;

	private final String patent;

	@Setter
	private boolean work;

	public Vehicle(String model, String patent) {
		this.model = model;
		this.patent = patent;
	}

}
