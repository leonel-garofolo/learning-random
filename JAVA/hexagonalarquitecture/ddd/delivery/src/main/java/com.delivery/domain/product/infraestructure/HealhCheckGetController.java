package com.delivery.domain.product.infraestructure;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HealhCheckGetController {

	@GetMapping("/health-check")
	public HashMap<String, String> index() {
		HashMap<String, String> status = new HashMap<>();
		status.put("status", "OK");
		return status;
	}
}
