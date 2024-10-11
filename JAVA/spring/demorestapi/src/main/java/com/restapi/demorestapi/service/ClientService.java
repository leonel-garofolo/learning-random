package com.restapi.demorestapi.service;


import com.restapi.demorestapi.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

	List<Client> findAll();

	Optional<Client> findById(String id);

	void save(Client client);
	Boolean delete(Client client);
}
