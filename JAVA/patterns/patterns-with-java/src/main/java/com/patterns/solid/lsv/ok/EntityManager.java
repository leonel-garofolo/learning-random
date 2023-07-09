package com.patterns.solid.lsv.ok;

import com.patterns.solid.lsv.ok.model.User;

public interface EntityManager {

	void persist(User user);

	void flush(User user);

}
