package com.patterns.gof.creational.factory;

import org.junit.Test;

import com.patterns.gof.creational.factory.Computer;
import com.patterns.gof.creational.factory.ComputerFactory;
import com.patterns.gof.creational.factory.TYPE_COMPUTER;

public class ComputerFactoryTest {

	@Test
	public void printComputers() {
		Computer pc = ComputerFactory.getComputer(TYPE_COMPUTER.PC, "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer(TYPE_COMPUTER.SERVER, "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}