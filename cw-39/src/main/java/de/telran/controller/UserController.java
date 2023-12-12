package de.telran.controller;

import de.telran.dto.UserCreateOrUpdateReq;
import de.telran.model.User;
import de.telran.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class UserController {
    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @PreAuthorize(value = "hasRole('USER')")
    public List<User> users(@RequestParam(required = false) Map<String, String> params, HttpServletRequest request, HttpServletResponse response) {
       // request.getSession().setAttribute("test", "value");
        response.addCookie(new Cookie("test", "abracadabra"));
        if(params.get("name") == null) {
            return userService.findAll();
        } else  {
            return userService.findAllByName(params.get("name"));
        }
    }

    @GetMapping("/users/{id}")
    @PreAuthorize(value = "hasRole('ADMIN')")
    public User getUser(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping("/users")
    public User create(@RequestBody @Valid UserCreateOrUpdateReq user) {
        return userService.create(user);
    }

    @DeleteMapping("/users/{id}")
    public User delete(@PathVariable int id) {
        return userService.delete(id);
    }

    @PutMapping("/users/{id}")
    public User delete(@PathVariable int id, @RequestBody @Valid UserCreateOrUpdateReq user) {
        return userService.update(id, user);
    }

//    @ExceptionHandler(UsersNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public Map<String, String> errorHandling(UsersNotFoundException une){
//       return Map.of("error", "users not found");
//    }
}
