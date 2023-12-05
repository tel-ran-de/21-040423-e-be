package de.telran.dao;

import de.telran.database.Db;
import de.telran.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbUserDao implements UserDao {
    Db db;

    public DbUserDao(Db db) {
        this.db = db;
        String createQuery = "CREATE TABLE if not exists Users (Id int primary key, name VARCHAR(255), email VARCHAR(255), age int)";
        try (Statement statement = db.getConnection().createStatement()) {
            statement.execute(createQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> findAll() {
        try (Statement statement = db.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("Select * from Users");
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
                users.add(new User(name, id, age));
            }
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(User user) {
        try (PreparedStatement statement = db.getConnection().prepareStatement("Insert into Users (Id, age, name) values (?, ?, ?)")) {
            statement.setInt(1, user.getId());
            statement.setInt(2, user.getAge());
            statement.setString(3, user.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<User> findAllByName(String name) {
        try (Statement statement = db.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("Select * from Users WHERE name='%s'".formatted(name));
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                int age = resultSet.getInt("age");
                name = resultSet.getString("name");
                users.add(new User(name, id, age));
            }
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
