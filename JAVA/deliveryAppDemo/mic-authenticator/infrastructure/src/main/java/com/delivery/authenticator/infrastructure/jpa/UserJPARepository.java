package com.delivery.authenticator.infrastructure.jpa;

import java.util.UUID;

import com.delivery.authenticator.infrastructure.dao.UserDao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserJPARepository extends MongoRepository<UserDao, UUID> {

}
