package com.restapi.demorestapi.repository.dao;

import com.restapi.demorestapi.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product, String> {
}
