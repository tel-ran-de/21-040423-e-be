package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser(@RequestParam String email) {
        User userByEmail = userService.getUserByEmail(email);
        if (userByEmail == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userByEmail);
    }

    @PostMapping(value = "/user", consumes = {"application/json", "application/xml"})
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userByEmail = userService.create(user);
        if (userByEmail == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(userByEmail);
    }
}
