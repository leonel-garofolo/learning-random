package com.tdd.app.innertest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class MyPrivateClass {

	private final static Logger LOGGER = LoggerFactory.getLogger(MyPrivateClass.class);

	public void doSomething(){
		LOGGER.debug("Hello! I do something");
		System.out.println("Hello! I do something");
	}
}
