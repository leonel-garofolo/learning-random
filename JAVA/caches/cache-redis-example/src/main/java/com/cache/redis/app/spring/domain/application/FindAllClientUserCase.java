package com.cache.redis.app.spring.domain.application;

import java.util.List;
import java.util.Optional;

import com.cache.redis.app.spring.domain.UserCase;
import com.cache.redis.app.spring.domain.model.Client;

public interface FindAllClientUserCase extends UserCase<Void, List<Client>> {

}

