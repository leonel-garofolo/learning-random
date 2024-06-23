package com.delivery.authenticator.infraestructure;

import com.delivery.authenticator.domain.User;

public interface UserRepository {

  boolean create(User user);

}
