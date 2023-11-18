package de.telran;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String email) {
        super("User exists: "+ email);
    }
}
