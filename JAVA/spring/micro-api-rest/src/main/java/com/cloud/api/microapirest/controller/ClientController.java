package com.cloud.api.microapirest.controller;

import com.cloud.api.microapirest.exceptions.ClientNotFoundException;
import com.cloud.api.microapirest.model.Client;
import com.cloud.api.microapirest.service.ClientService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@RestController("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/client/all")
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@GetMapping("/client/{id}")
	public Client find(@PathVariable String id) throws ClientNotFoundException {
		Optional<Client> client = clientService.findById(id);
		if (client.isPresent()) {
			return client.get();
		}
		return client.orElseThrow(() -> new ClientNotFoundException(id));
	}

	@PostMapping("/client")
	public Client save(Client client) {
		if (client != null) {
			clientService.save(client);
		}
		return client;
	}

	@DeleteMapping("/client")
	public Client delete(Client client) {
		if (client != null) {
			clientService.delete(client);
		}
		return client;
	}
}
