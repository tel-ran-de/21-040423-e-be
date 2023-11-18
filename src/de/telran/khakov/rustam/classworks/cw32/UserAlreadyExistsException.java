package de.telran.khakov.rustam.classworks.cw32;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String email) {
        super("User exists: "+ email);
    }
}
