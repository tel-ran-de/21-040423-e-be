package de.telran.khakov.rustam.classworks.cw34;

import de.telran.khakov.rustam.classworks.cw32.User;

import java.util.ArrayList;
import java.util.List;

@TestAnnotation(name = "Data storage")
@Deprecated
public class Database {

    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("test@tes.com", "P@ssw0rd", "John"));
        return users;
    }
}
