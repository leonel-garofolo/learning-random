package com.cloud.api.microapirest.service;

import com.cloud.api.microapirest.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

	List<Product> findAll();

	Optional<Product> findById(String id);

	void save(Product product);
	Boolean delete(Product id);
}
