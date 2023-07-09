package com.delivery.domain.product.domain;

import org.springframework.beans.factory.annotation.Autowired;

import com.shared.domain.AggregateRoot;

public class Product extends AggregateRoot {

	@Autowired
	private static ProductRepository productRepository;

	private final ProductId id;
	private final ProductName name;

	private final ProductDescription description;

	private Product(ProductId id, ProductName name, ProductDescription description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public static Product create(ProductId id, ProductName name, ProductDescription description) {
		final Product product = new Product(id, name, description);
		productRepository.create(product);

		return product;
	}
}
