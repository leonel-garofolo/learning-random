package com.cloud.report.api.microreportapi.controller;

import com.cloud.report.api.microreportapi.model.ProductReport;
import com.cloud.report.api.microreportapi.service.ProductReportService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@RestController("/product")
public class ProductReportController {

	@Autowired
	private ProductReportService productService;

	@GetMapping("/product/")
	public List<ProductReport> findAll() {
		return productService.findAll();
	}

	@GetMapping("/product/{id}")
	public ProductReport find(@PathVariable String id) {
		Optional<ProductReport> client = productService.findById(id);
		if (client.isPresent()) {
			return client.get();
		}
		return null;
	}

	@PostMapping("/product")
	public ProductReport save(ProductReport productReport) {
		if (productReport != null) {
			productService.save(productReport);
		}
		return productReport;
	}

	@DeleteMapping("/product")
	public ProductReport delete(ProductReport productReport) {
		if (productReport != null) {
			productService.delete(productReport);
		}
		return productReport;
	}
}
