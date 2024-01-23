package de.telran.service;

import de.telran.dao.UserRepository;
import de.telran.dto.UserCreateOrUpdateReq;
import de.telran.exception.PasswordMismatchException;
import de.telran.exception.UsersNotFoundException;
import de.telran.model.User;
import de.telran.exception.UserNotFoundException;
import de.telran.model.UserStatus;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;
    private final UserMailService userMailService;

    //@Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, UserMailService userMailService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMailService = userMailService;
    }

    public List<User> findAllByName(String name) {
        List<User> allByName = userRepository.findAllByName(name);
        if(allByName.isEmpty()) {
            throw new UsersNotFoundException();
        }
        return allByName;
    }

    public User create(UserCreateOrUpdateReq user) {
        if (!StringUtils.equals(user.getPassword(), user.getRepeatPassword())) {
            throw new PasswordMismatchException();
        }
        String activationToken = UUID.randomUUID().toString();
        User userToCreate = new User();
        userToCreate.setAge(user.getAge());
        userToCreate.setEmail(user.getEmail());
        userToCreate.setName(user.getName());
        userToCreate.setPassword(passwordEncoder.encode(user.getPassword()));
        userToCreate.setActivationToken(activationToken);
        userToCreate.setActivateToTime(LocalDateTime.now().plusMinutes(5));
        userMailService.send("<a href='http://localhost:8080/activate?token=%s&email=%s'>activate<a>".formatted(activationToken, user.getEmail()), user.getEmail());
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

    public User getByEmail(String email) {
        return userRepository.findUserByEmail(email).orElseThrow();
    }

    public boolean activate(String token, String email) {
        LocalDateTime now = LocalDateTime.now();
        User user = userRepository.findUserByEmail(email).orElseThrow();
        if(StringUtils.equals(user.getActivationToken(), token) && now.isBefore(user.getActivateToTime())) {
            user.setStatus(UserStatus.ACTIVATED);
            user.setActivationToken(null);
            user.setActivateToTime(null);
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
