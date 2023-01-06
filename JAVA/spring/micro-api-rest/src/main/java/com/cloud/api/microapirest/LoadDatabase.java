package com.cloud.api.microapirest;

import com.cloud.api.microapirest.model.Product;
import com.cloud.api.microapirest.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.IntStream;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(ProductService productService) {
		return args -> {
			IntStream.range(0, 10).forEach(index -> {
				final Product product = new Product(String.format("product - %d", index), 10.5 + index);
				productService.save(product);
				log.info("Preloading -> {}", product);
			});
		};
	}
}