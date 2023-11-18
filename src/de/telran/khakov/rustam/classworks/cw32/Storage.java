package de.telran.khakov.rustam.classworks.cw32;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    Map<String, User> users = new HashMap<>();

    public void addUser(User user) throws UserAlreadyExistsException {
        if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistsException(user.getEmail());
        }
        users.put(user.getEmail(), user);
    }

    public User getUser(String email) throws UserAlreadyExistsException {
        return users.get(email);
    }
}
