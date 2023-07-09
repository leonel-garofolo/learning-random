package com.delivery.domain.product.infraestructure;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.delivery.app.ApplicationTestCase;
import com.delivery.domain.product.application.ProductCreate;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ProductCreateControllerTest extends ApplicationTestCase {

	@Autowired
	private ProductCreateController productCreateController;

	@Autowired
	private ProductCreate productCreate;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void create() {
		productCreateController.create();
		verify(productCreate, times(1)).create("name", "description");
	}
}