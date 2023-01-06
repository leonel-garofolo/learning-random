package com.cloud.report.api.microreportapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cloud.report.api.microreportapi.model.ProductReport;

public interface CustomerRepository extends MongoRepository<ProductReport, String> {

	ProductReport findByFirstName(String firstName);

	List<ProductReport> findByLastName(String lastName);

}