package com.tdd.app.concepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.tdd.app.concepts.model.User;

final class HardcodedInMemoryUsersIntoRepository {
	private Map<Integer, User> users = Collections.unmodifiableMap(new HashMap<Integer, User>() {
		{
			put(1, new User("Administrator"));
			put(2, new User("Operator"));
		}
	});

	public Optional<User> search(Integer id) {
		return Optional.ofNullable(users.get(id));
	}
}