package com.patterns.solid.dip;

import java.util.Optional;

public interface UsersRepository {
    Optional<User> search(Integer id);
}