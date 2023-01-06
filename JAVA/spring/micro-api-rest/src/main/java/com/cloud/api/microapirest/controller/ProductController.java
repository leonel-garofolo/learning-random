package com.cloud.api.microapirest.controller;

import com.cloud.api.microapirest.exceptions.ProductNotFoundException;
import com.cloud.api.microapirest.model.Product;
import com.cloud.api.microapirest.service.ProductService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@RestController("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product/")
	public List<Product> findAll() {
		return productService.findAll();
	}

	@GetMapping("/product/{id}")
	public Product find(@PathVariable String id) throws ProductNotFoundException {
		Optional<Product> client = productService.findById(id);
		if (client.isPresent()) {
			return client.get();
		}
		return client.orElseThrow(() -> new ProductNotFoundException(id));
	}

	@PostMapping("/product")
	public Product save(Product client) {
		if (client != null) {
			productService.save(client);
		}
		return client;
	}

	@DeleteMapping("/product")
	public Product delete(Product client) {
		if (client != null) {
			productService.delete(client);
		}
		return client;
	}
}
