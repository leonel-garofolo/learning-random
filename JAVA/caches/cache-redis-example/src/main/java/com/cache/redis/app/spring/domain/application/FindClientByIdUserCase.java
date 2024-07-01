package com.cache.redis.app.spring.domain.application;

import java.util.Optional;

import com.cache.redis.app.spring.domain.UserCase;
import com.cache.redis.app.spring.domain.model.Client;

public interface FindClientByIdUserCase extends UserCase<String, Optional<Client>> {

}

