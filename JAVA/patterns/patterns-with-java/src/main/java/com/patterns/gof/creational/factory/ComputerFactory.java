package com.patterns.gof.creational.factory;

public class ComputerFactory {

	public static Computer getComputer(TYPE_COMPUTER typeComputer, String ram, String hdd, String cpu) {
		if (TYPE_COMPUTER.PC == typeComputer)
			return new PC(ram, hdd, cpu);
		else if (TYPE_COMPUTER.SERVER == typeComputer)
			return new Server(ram, hdd, cpu);

		return null;
	}
}