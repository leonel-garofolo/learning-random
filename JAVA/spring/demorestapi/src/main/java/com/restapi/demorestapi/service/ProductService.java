package com.restapi.demorestapi.service;

import com.restapi.demorestapi.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

	List<Product> findAll();

	Optional<Product> findById(String id);

	void save(Product product);
	Boolean delete(Product id);
}
