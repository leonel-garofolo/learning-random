package com.patterns.solid.lsv.ok;

import java.util.List;

import com.patterns.solid.lsv.ok.model.User;
import com.patterns.solid.lsv.ok.model.UserId;

interface UserRepository {
	void save(User user);

	void saveAll(List<User> users);

	User search(UserId $id);

	User all();
}