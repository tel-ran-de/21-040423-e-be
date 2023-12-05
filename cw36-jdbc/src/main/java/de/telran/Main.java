package de.telran;

import de.telran.dao.DbUserDao;
import de.telran.dao.UserDao;
import de.telran.database.Db;
import de.telran.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Db db = new Db();
        UserDao userDao = new DbUserDao(db);
        userDao.create(new User("John", 1, 33));
        userDao.create(new User("David", 2, 30));
//        userDao.create(new User("Ivan", 3, 53));
        userDao.create(new User("Ivan'); Insert into Users (Id, age, name) values (4, 34,'JohnBad", 3, 53));

        List<User> all = userDao.findAll();
        all.get(0);
        List<User> david = userDao.findAllByName("David");
//        List<User> badRequest = userDao.findAllByName("david'; DROP TABLE Users");
//        userDao.findAll();
//        System.out.println(david);

    }
}