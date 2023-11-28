package de.telran;

import de.telran.config.Configurable;
import de.telran.config.FileConfig;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<Class<?>, Object> objects = new HashMap<>();
    private Configurable config;
    public Context(Configurable config) {
        this.config = config;
        objects.put(Hashable.class, config.hashable());
        objects.put(Storage.class, config.storage());
        objects.put(UserService.class, config.userService());
    }

    public Object get(Class<?> clazz) {
        return objects.get(clazz);
    }
}
