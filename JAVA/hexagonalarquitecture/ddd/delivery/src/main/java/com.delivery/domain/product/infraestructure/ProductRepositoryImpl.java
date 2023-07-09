package com.delivery.domain.product.infraestructure;

import com.delivery.domain.product.domain.Product;
import com.delivery.domain.product.domain.ProductId;
import com.delivery.domain.product.domain.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {
	@Override
	public ProductId create(Product product) {
		return new ProductId(1L);
	}
}
