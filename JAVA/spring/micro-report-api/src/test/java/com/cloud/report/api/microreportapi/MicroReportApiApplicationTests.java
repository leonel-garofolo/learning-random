package com.cloud.report.api.microreportapi;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cloud.report.api.microreportapi.controller.ProductReportController;

@SpringBootTest
class MicroReportApiApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(MicroReportApiApplicationTests.class);

	@Autowired
	private ProductReportController productReportController;

	@Test
	void contextLoads() {
		Assert.assertTrue(productReportController.findAll().size() ==0);
	}

}
