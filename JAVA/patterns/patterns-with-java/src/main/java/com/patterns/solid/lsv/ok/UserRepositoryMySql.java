package com.patterns.solid.lsv.ok;

import java.util.List;

import com.patterns.solid.lsv.ok.model.User;
import com.patterns.solid.lsv.ok.model.UserId;

final class UserRepositoryMySql extends Repository implements UserRepository
{

    @Override
    public void save(User user) {
        this.entityManager.persist(user);
        this.entityManager.flush(user);
    }

    @Override
    public void saveAll(List<User> users) {
        users.forEach(user -> this.entityManager.persist(user));
    }

    @Override
    public User search(UserId $id) {
        return null;
    }

    @Override
    public User all() {
        return null;
    }
}