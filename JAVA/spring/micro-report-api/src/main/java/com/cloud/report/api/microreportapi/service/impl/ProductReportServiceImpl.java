package com.cloud.report.api.microreportapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloud.report.api.microreportapi.model.ProductReport;
import com.cloud.report.api.microreportapi.repository.ProductReportRepository;
import com.cloud.report.api.microreportapi.service.ProductReportService;

@Component
public class ProductReportServiceImpl implements ProductReportService {

	private static final Logger log = LoggerFactory.getLogger(ProductReportServiceImpl.class);

	@Autowired
	private ProductReportRepository productReportRepository;

	@Override
	public List<ProductReport> findAll() {
		return productReportRepository.findAll();
	}

	@Override
	public Optional<ProductReport> findById(String id) {
		return productReportRepository.findById(id);
	}

	@Override
	public void save(ProductReport product) {
		productReportRepository.save(product);
	}

	@Override
	public Boolean delete(ProductReport productReport) {
		try {
			productReportRepository.delete(productReport);
			return true;
		} catch (Exception e) {
			log.error("Can't delete", e);
		}
		return false;
	}
}
