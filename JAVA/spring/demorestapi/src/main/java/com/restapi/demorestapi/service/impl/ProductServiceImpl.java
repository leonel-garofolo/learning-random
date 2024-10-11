package com.restapi.demorestapi.service.impl;

import com.restapi.demorestapi.repository.dao.ProductDao;
import com.restapi.demorestapi.model.Product;
import com.restapi.demorestapi.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductServiceImpl implements ProductService {

	ProductDao productDao;

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
