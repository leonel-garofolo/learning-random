package com.patterns.solid.srp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageBookPrinterTest {

	@Test
	public void printPage() {
		PageBookPrinter pageBookPrinter= new PageBookPrinter();
		pageBookPrinter.printPage();
	}
}