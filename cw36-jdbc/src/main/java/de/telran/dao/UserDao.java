package de.telran.dao;

import de.telran.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    void create(User user);

    List<User> findAllByName(String name);
}
