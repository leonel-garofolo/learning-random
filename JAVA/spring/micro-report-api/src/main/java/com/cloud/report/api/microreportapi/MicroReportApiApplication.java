package com.cloud.report.api.microreportapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cloud.report.api.microreportapi.model.ProductReport;
import com.cloud.report.api.microreportapi.repository.CustomerRepository;

@SpringBootApplication
public class MicroReportApiApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MicroReportApiApplication.class);

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MicroReportApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a couple of customers
		repository.save(new ProductReport("Alice", "Smith", 0));
		repository.save(new ProductReport("Bob", "Smith", 0));

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
