package de.telran.config;

import de.telran.Config;
import de.telran.Hashable;
import de.telran.Storage;
import de.telran.UserService;
import de.telran.annotations.MyBean;
import de.telran.annotations.MyConfiguration;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationConfig implements Configurable {
    Hashable hashable;
    Storage storage;
    UserService userService;

    public AnnotationConfig() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Config> configClass = Config.class;
        Config config = configClass.getConstructor().newInstance();
        if (configClass.getAnnotation(MyConfiguration.class) != null) {
            Method[] declaredMethods = configClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.getAnnotation(MyBean.class) != null) {
                    Object invoke = method.invoke(config);
                    if (invoke instanceof Hashable h) {
                        hashable = h;
                    } else if (invoke instanceof Storage s) {
                        storage = s;
                    }
                }
            }

        }
    }

    @Override
    public Hashable hashable() {
        return null;
    }

    @Override
    public Storage storage() {
        return null;
    }

    @Override
    public UserService userService() {
        return null;
    }
}
