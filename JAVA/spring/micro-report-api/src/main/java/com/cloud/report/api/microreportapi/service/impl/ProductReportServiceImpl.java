package com.cloud.report.api.microreportapi.service.impl;

import com.cloud.report.api.microreportapi.model.ProductReport;
import com.cloud.report.api.microreportapi.service.ProductReportService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductReportServiceImpl implements ProductReportService {

	@Override
	public List<ProductReport> findAll() {
		return new ArrayList<>();
	}

	@Override
	public Optional<ProductReport> findById(String id) {
		return null;
	}

	@Override
	public void save(ProductReport product) {
			  	
	}

	@Override
	public Boolean delete(ProductReport ProductReport) {
		return false;
	}
}
