package de.telran.controller;

import de.telran.model.User;
import de.telran.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class UserController {
    int counter = 1;
    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> users() {
        return userService.findAll();
    }

    @PostMapping("/create")
    public User create(@RequestParam String email) {
        return userService.create(new User("Test", counter++, new Random().nextInt(100), email));
    }

    @GetMapping("/user")
    public List<User> usersByName(@RequestParam String name) {
        return userService.findAllByName(name);
    }

//    @ExceptionHandler(UsersNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public Map<String, String> errorHandling(UsersNotFoundException une){
//       return Map.of("error", "users not found");
//    }
}
