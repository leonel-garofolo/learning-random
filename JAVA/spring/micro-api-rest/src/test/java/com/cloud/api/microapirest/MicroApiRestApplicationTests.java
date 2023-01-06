package com.cloud.api.microapirest;

import com.cloud.api.microapirest.service.ProductService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicroApiRestApplicationTests {
	private static final Logger log = LoggerFactory.getLogger(MicroApiRestApplicationTests.class);

	@Autowired
	private ProductService productService;

	@Test
	void contextLoads() {
		log.info("Product Count -> {}", productService.findAll().size());
	}

}
