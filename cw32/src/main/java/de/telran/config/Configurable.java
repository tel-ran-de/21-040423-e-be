package de.telran.config;

import de.telran.Hashable;
import de.telran.Storage;
import de.telran.UserService;

public interface Configurable {
    Hashable hashable();

    Storage storage();

    UserService userService();
}
