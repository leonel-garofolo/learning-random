package com.patterns.gof.creational.builder;

import org.junit.Test;

import com.patterns.gof.creational.builder.Computer;

public class BuilderPatternTest {

	@Test
	public void buildTest() {
		//Using builder to get the object in a single line of code and 
		//without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp.toString());
	}

}