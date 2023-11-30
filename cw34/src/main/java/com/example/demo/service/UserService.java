package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String email, String pass) {
        User userByEmail = userRepository.getUserByEmail(email);
        //check password
        return userByEmail;
    }

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    public User create(User user) {
        if (userRepository.getUserByEmail(user.getEmail()) == null) {
            userRepository.create(user);
            return user;
        }
        return null;
    }
}
