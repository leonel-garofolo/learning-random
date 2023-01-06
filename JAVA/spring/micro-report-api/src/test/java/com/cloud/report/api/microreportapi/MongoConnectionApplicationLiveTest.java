package com.cloud.report.api.microreportapi;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cloud.report.api.microreportapi.model.ProductReport;
import com.cloud.report.api.microreportapi.repository.CustomerRepository;

@SpringBootTest
public class MongoConnectionApplicationLiveTest {

	private static final Logger log = LoggerFactory.getLogger(MongoConnectionApplicationLiveTest.class);

	@Autowired
	private CustomerRepository repository;

	@Test
	public void whenPropertiesConfig_thenInsertSucceeds() {
		ProductReport productReport =new ProductReport();
		productReport.setName("Product 1");
		productReport.setDescription("Product Desc 1");
		productReport.setSold(0);
		repository.save(productReport);

		log.info("count -> {}", repository.findAll().size());
	}
}
