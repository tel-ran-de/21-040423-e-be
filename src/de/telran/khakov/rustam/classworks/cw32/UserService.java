package de.telran.khakov.rustam.classworks.cw32;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class UserService {

    Map<String, User> users = new HashMap<>();

    private void addUser(User user) throws UserAlreadyExistsException {
        if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistsException(user.getEmail());
        }
        users.put(user.getEmail(), user);
    }

    private User getUser(String email) throws UserAlreadyExistsException {
        return users.get(email);
    }

    public String hash(String original) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(original.getBytes());
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            return bigInt.toString(16);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public void register(User user) throws UserAlreadyExistsException {
        String hashedPwd = hash(user.getPassword());
        user.setPassword(hashedPwd);
        addUser(user);
    }
}
