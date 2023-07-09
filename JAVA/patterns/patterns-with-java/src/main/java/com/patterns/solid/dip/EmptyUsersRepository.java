package com.patterns.solid.dip;

import java.util.Optional;

public class EmptyUsersRepository implements UsersRepository{
	@Override
	public Optional<User> search(Integer id) {
		return Optional.empty();
	}
}
