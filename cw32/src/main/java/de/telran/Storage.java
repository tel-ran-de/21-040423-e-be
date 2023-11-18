package de.telran;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static Storage INSTANCE;

    Map<String, User> users = new HashMap<>();

    public static Storage getInstance() {
        if (INSTANCE == null) {
            synchronized (Storage.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Storage(new HashMap<>());
                }
            }
        }
        return INSTANCE;
    }

    private Storage(Map<String, User> users) {
        this.users = users;
    }

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
