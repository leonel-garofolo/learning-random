package com.tdd.app.innertest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPrivateClassTest {

	@Test
	public void doSomething() {
		MyPrivateClass myPrivateClass = new MyPrivateClass();
		myPrivateClass.doSomething();
	}
}