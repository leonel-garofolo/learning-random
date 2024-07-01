package com.cache.redis.app.spring.infrastructure.repository.client;

import org.springframework.data.repository.CrudRepository;

public interface ClientJpaRepository extends CrudRepository<ClientDao, String> {

}
