package com.cache.redis.app.spring.infrastructure.repository.client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRedisRepository extends CrudRepository<ClientCache, String> {
    // Puedes agregar métodos personalizados según tus necesidades
}
