package com.restapi.demorestapi.controller;

import com.restapi.demorestapi.api.ProductsApi;
import com.restapi.demorestapi.api.dto.ProductRequest;
import com.restapi.demorestapi.api.dto.ProductResponse;
import com.restapi.demorestapi.model.convert.ProductConvert;
import com.restapi.demorestapi.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController implements ProductsApi {

	ProductService productService;
	ProductConvert productConvert;

	@Override
	public ResponseEntity<List<ProductResponse>> findAllProduct() {
		return ResponseEntity.ok(productConvert.asProductsResponse(productService.findAll()));
	}

	@Override
	public ResponseEntity<ProductResponse> findProduct(String id) {
		return productService.findById(id)
				.map(product -> ResponseEntity.ok(productConvert.asProductResponse(product)))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@Override
	public ResponseEntity<Void> createProduct(ProductRequest productRequest) {
		productService.save(productConvert.asProduct(productRequest));
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Void> deleteProduct(String id) {
		var product = productService.findById(id);
		if (product.isPresent()) {
			productService.delete(product.get());
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
