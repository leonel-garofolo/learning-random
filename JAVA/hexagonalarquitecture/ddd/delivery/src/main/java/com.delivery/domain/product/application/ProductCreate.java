package com.delivery.domain.product.application;

import org.springframework.stereotype.Service;

import com.delivery.domain.product.domain.Product;
import com.delivery.domain.product.domain.ProductDescription;
import com.delivery.domain.product.domain.ProductName;

@Service(value = "productCreate")
public class ProductCreate {
	//private final EventBus eventBus;

	public ProductCreate() {
		super();
	}

	/*
	public ProductCreate(EventBus eventBus) {

		this.eventBus = eventBus;
	}
	 */

	public void create(String name, String description) {
		final ProductName productName = new ProductName(name);
		final ProductDescription productDescription = new ProductDescription(description);

		final Product product = Product.create(null, productName, productDescription);
		//this.eventBus.publish(product.pullDomainEvents());
	}
}
