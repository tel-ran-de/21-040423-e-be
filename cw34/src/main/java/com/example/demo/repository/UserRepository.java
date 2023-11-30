package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private Map<String, User> users = new HashMap<>();

    public UserRepository() {
        users.put("test.test@test", new User("John", 33));
    }

    public Collection<User> findAll() {
        return users.values();
    }

    public User getUserByEmail(String email) {
        return users.get(email);
    }

    public void create(User user) {
        users.put(user.getEmail(), user);
    }
}
