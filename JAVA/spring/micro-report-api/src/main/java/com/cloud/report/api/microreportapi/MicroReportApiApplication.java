package com.cloud.report.api.microreportapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thread.lab.utils.UtilsThreadLab;

import com.cloud.report.api.microreportapi.model.ProductReport;
import com.cloud.report.api.microreportapi.repository.ProductReportRepository;

@SpringBootApplication
public class MicroReportApiApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MicroReportApiApplication.class);

	@Autowired
	private ProductReportRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MicroReportApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// save a couple of customers
		repository.save(new ProductReport(UtilsThreadLab.getCurrentTimestamp(), "Alice", "Smith", 0));
		repository.save(new ProductReport(UtilsThreadLab.getCurrentTimestamp(), "Bob", "Smith", 0));

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (ProductReport productReport : repository.findAll()) {
			log.info("ProductReport -> {}", productReport);
		}

		// fetch an individual customer
		log.info("Customer found with findByFirstName('Alice'):");
		log.info("--------------------------------");
		log.info("productReport -> {}", repository.findByName("Alice"));

		log.info("Customers found with findByLastName('Smith'):");
		log.info("--------------------------------");
		for (ProductReport productReport : repository.findByDescription("Smith")) {
			log.info("proca-> {}", productReport);
		}
	}

}
