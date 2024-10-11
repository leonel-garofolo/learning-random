package com.restapi.demorestapi.service.impl;

import com.restapi.demorestapi.repository.dao.ClientDao;
import com.restapi.demorestapi.model.Client;
import com.restapi.demorestapi.service.ClientService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ClientServiceImpl implements ClientService {

	ClientDao clientDao;

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
