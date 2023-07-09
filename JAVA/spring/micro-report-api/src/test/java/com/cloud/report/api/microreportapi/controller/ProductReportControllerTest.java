package com.cloud.report.api.microreportapi.controller;

import java.util.Date;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thread.lab.utils.UtilsThreadLab;

import com.cloud.report.api.microreportapi.model.ProductReport;

@SpringBootTest
public class ProductReportControllerTest {

	private static final Logger log = LoggerFactory.getLogger(ProductReportControllerTest.class);

	@Autowired
	private ProductReportController productReportController;

	@Test
	public void insertOne() {
		insertWith(1);
	}
	@Test
	public void insertMil() {
		insertWith(1000);
	}

	//@Test
	public void insertCienMil() {
		insertWith(100000);
	}

	//@Test
	public void insertHalfMillon() {
		insertWith(500000);
	}

	private void insertWith(final int count) {
		final Date start = UtilsThreadLab.getCurrentTimestamp();
		Random random = new Random();
		IntStream.range(0, count).forEach(index -> {
			ProductReport productReport =new ProductReport();
			productReport.setName("Product 1");
			productReport.setDescription("Product Desc 1");
			productReport.setSold(random.ints(1000).sum());
			productReportController.save(productReport);
			log.info("insertando index: {}", index);
		});
		final Date end = UtilsThreadLab.getCurrentTimestamp();
		log.info("count register -> {} in {} seg", productReportController.findAll().size(), UtilsThreadLab.getDiffDate(start, end));
	}
}
