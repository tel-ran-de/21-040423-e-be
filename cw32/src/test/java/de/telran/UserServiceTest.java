package de.telran;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void registerTwoUsersWithSameEmailShouldThrowException() throws UserAlreadyExistsException {
        UserService userService = new UserService(Storage.getInstance(), (str) -> str);
        userService.register(new User("test@test.com", "test123", "John Doe"));
        Assertions.assertThrows(UserAlreadyExistsException.class, () -> userService.register(new User("test@test.com", "test1234", "John2 Doe2")));
    }
}