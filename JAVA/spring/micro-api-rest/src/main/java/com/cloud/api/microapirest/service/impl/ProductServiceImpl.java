package com.cloud.api.microapirest.service.impl;

import com.cloud.api.microapirest.dao.ProductDao;
import com.cloud.api.microapirest.model.Product;
import com.cloud.api.microapirest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findAll() {
		return (List<Product>) productDao.findAll();
	}

	@Override
	public Optional<Product> findById(String id) {
		return productDao.findById(id);
	}

	@Override
	public void save(Product product) {
		product.setId(UUID.randomUUID().toString());
		productDao.save(product);
	}

	@Override
	public Boolean delete(Product Product) {
		try {
			productDao.delete(Product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
