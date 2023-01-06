package com.cloud.api.microapirest.dao;

import com.cloud.api.microapirest.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product, String> {
}
