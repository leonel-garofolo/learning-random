package com.tdd.app.concepts;

import java.util.Map;
import java.util.Optional;

import com.tdd.app.concepts.model.User;

final class HardcodedInMemoryUsersRepository {
	private Map<Integer, User> users;

	public HardcodedInMemoryUsersRepository(Map<Integer, User> users) {
		this.users = users;
	}

	public Optional<User> search(Integer id) {
		return Optional.ofNullable(users.get(id));
	}
}