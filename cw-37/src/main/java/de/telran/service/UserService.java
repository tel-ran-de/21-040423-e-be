package de.telran.service;

import de.telran.dao.UserRepository;
import de.telran.model.User;
import de.telran.exception.UsersNotFoundException;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    //@Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllByName(String name) {
        List<User> allByName = userRepository.findAllByName(name);
        if(allByName.isEmpty()) {
            throw new UsersNotFoundException();
        }
        return allByName;
    }

    public User create(@Valid User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
