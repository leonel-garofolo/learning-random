package com.cloud.api.microapirest.dao;

import com.cloud.api.microapirest.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends CrudRepository<Client, String> {
}
