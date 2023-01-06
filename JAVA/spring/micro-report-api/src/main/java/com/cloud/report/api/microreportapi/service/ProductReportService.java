package com.cloud.report.api.microreportapi.service;

import com.cloud.report.api.microreportapi.model.ProductReport;

import java.util.List;
import java.util.Optional;

public interface ProductReportService {

	List<ProductReport> findAll();

	Optional<ProductReport> findById(String id);

	void save(ProductReport product);

	Boolean delete(ProductReport id);
}
