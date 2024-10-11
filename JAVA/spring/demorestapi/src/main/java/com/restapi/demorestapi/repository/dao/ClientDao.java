package com.restapi.demorestapi.repository.dao;

import com.restapi.demorestapi.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends CrudRepository<Client, String> {
}
