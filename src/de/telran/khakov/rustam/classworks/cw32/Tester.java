package de.telran.khakov.rustam.classworks.cw32;

public class Tester {
    public static void main(String[] args) throws UserAlreadyExistsException {
        UserService userService = new UserService();
        userService.register(new User("test@test.com", "test123", "John Doe"));
        userService.register(new User("test@test.com", "test1234", "John2 Doe2"));
    }
}
