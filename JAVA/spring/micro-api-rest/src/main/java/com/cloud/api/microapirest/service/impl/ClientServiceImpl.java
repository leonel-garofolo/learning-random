package com.cloud.api.microapirest.service.impl;

import com.cloud.api.microapirest.dao.ClientDao;
import com.cloud.api.microapirest.model.Client;
import com.cloud.api.microapirest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Override
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}

	@Override
	public Optional<Client> findById(String id) {
		return clientDao.findById(id);
	}

	@Override
	public void save(Client client) {
		if (client.getId() == null) {
			client.setId(UUID.randomUUID().toString());
		}
		clientDao.save(client);
	}

	@Override
	public Boolean delete(Client client) {
		try {
			clientDao.delete(client);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
