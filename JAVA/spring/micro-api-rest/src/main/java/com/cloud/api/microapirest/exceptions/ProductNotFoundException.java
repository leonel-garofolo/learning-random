package com.cloud.api.microapirest.exceptions;

public class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String id) {
		super("Could not find employee " + id);
	}
}
