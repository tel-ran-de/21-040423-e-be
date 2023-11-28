package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository {

    public List<User> findAll() {
        return List.of(new User());
    }

    public User getUserByEmail(String email) {
        return new User();
    }
}
