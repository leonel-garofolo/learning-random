package com.cloud.api.microapirest.exceptions;

public class ClientNotFoundException extends Exception {
	public ClientNotFoundException(String id) {
		super("Could not find employee " + id);
	}
}
