package de.telran.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static Connection INSTANCE;
    public Connection getConnection() {
        if(INSTANCE == null) {
            try {
                INSTANCE = init();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return INSTANCE;
    }

    private Connection init() throws ClassNotFoundException, SQLException {
        String driverName = "com.mysql.jdbc.Driver";
        String connUrl = "jdbc:mysql://localhost:3306/db1";
        Class.forName(driverName);
        return DriverManager.getConnection(connUrl, "root","password");
    }
}
