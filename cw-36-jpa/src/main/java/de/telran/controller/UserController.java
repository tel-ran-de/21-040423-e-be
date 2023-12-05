package de.telran.controller;

import de.telran.dao.UserRepository;
import de.telran.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class UserController {
    int counter = 1;
    private UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @GetMapping("/create")
    public User create() {
        return userRepository.save(new User("Test", counter++, new Random().nextInt(100)));
    }

    @GetMapping("/user")
    public List<User> usersByName(@RequestParam String name) {
        return userRepository.findAllByName(name);
    }
}
