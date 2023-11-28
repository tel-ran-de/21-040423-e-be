package de.telran;

import de.telran.config.AnnotationConfig;
import de.telran.config.Configurable;
import de.telran.config.FileConfig;

import java.lang.reflect.InvocationTargetException;

public class Application {

    public static void main(String[] args) throws UserAlreadyExistsException, UserNotExistsException, IncorrectPasswordException,
            InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Configurable config = new FileConfig(args);
        //Configurable config = new AnnotationConfig();
        Context context = new Context(config);



        UserService userService = (UserService) context.get(UserService.class);
//        userService.register();
//        userService.login()
        //run tomcat server
        User user = userService.login("", "");

    }
}
