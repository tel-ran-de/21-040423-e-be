package de.telran;

public class UserService {

    private Storage storage;
    private Hashable hasher;

    public UserService(Storage storage, Hashable hasher) {
        this.storage = storage;
        this.hasher = hasher;
    }

    public void register(User user) throws UserAlreadyExistsException {
        String hashedPwd = hasher.hash(user.getPassword());
        //validaPassword
        user.setPassword(hashedPwd);
        storage.addUser(user);
    }

    public void update(String email, String name) throws UserAlreadyExistsException, UserNotExistsException {
        User user = storage.getUser(email);

        if (user == null) {
            throw new UserNotExistsException();
        }
        user.setName(name);
    }


    public User login(String email, String password) throws UserAlreadyExistsException, UserNotExistsException, IncorrectPasswordException {
        User user = storage.getUser(email);
        if (user == null) {
            throw new UserNotExistsException();
        }
        String hash = hasher.hash(password);
        if (hash.equals(user.getPassword())) {
            return user;
        }
        throw new IncorrectPasswordException();
    }

}
