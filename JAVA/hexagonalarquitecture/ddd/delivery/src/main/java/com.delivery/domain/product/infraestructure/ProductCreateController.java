package com.delivery.domain.product.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.delivery.domain.product.application.ProductCreate;

@Controller
public class ProductCreateController {

	@Autowired
	public ProductCreate productCreate;

	public void create(){
		// TODO
		productCreate.create("name", "description");
	}
}
