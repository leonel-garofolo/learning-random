package com.cloud.api.microapirest.controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductControllerTest {

	private static final Logger log = LoggerFactory.getLogger(ProductControllerTest.class);

	@Autowired
	private ProductController productController;

	@Test
	void findAll() {
		log.info("Product Count -> {}", productController.findAll().size());
	}
}
