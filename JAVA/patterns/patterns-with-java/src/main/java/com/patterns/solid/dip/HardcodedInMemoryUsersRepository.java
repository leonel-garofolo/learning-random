package com.patterns.solid.dip;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

final class HardcodedInMemoryUsersRepository implements UsersRepository{
    public static Map<Integer, User> USERS = Collections.unmodifiableMap(new HashMap<Integer, User>() {
        {
            put(1, new User(1, "User1"));
            put(2, new User(2, "User2"));
        }
    });

    public Optional<User> search(Integer id) {
        return Optional.ofNullable(USERS.get(id));
    }
}