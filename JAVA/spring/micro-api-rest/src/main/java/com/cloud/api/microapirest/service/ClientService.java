package com.cloud.api.microapirest.service;

import com.cloud.api.microapirest.model.Client;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientService {

	List<Client> findAll();

	Optional<Client> findById(String id);

	void save(Client client);
	Boolean delete(Client client);
}
