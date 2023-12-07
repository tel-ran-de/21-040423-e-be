package de.telran.service;

import de.telran.dao.UserRepository;
import de.telran.dto.UserCreateOrUpdateReq;
import de.telran.exception.UsersNotFoundException;
import de.telran.model.User;
import de.telran.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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

    public User create(UserCreateOrUpdateReq user) {
        User userToCreate = new User();
        userToCreate.setAge(user.getAge());
        userToCreate.setEmail(user.getEmail());
        userToCreate.setName(user.getName());
        return userRepository.save(userToCreate);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User getById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(UserNotFoundException::new);
    }

    public User delete(int id) {
        User user = getById(id);
        userRepository.deleteById(id);
        return user;
    }

    public User update(int id, UserCreateOrUpdateReq user) {
        User oldUser = getById(id);
        oldUser.setAge(user.getAge());
        oldUser.setEmail(user.getEmail());
        oldUser.setName(user.getName());
        return userRepository.save(oldUser);
    }
}
