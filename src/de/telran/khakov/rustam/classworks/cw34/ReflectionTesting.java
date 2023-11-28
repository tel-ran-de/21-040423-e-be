package de.telran.khakov.rustam.classworks.cw34;

import de.telran.khakov.rustam.classworks.cw32.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ReflectionTesting {
    @SuppressWarnings(value = {"deprecated"})
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Database database = new Database();
        User user = new User("test@tes.com", "P@ssw0rd", "John");
        List<User> users = database.findAllUsers();
        users.get(0);
        Class<? extends List> aClass = users.getClass();
        System.out.println(aClass);
        Class<? extends User> userClass = user.getClass();
        for (Field field : userClass.getDeclaredFields()) {
            System.out.println(field);
        }
        Field nameField = userClass.getDeclaredField("name");
        System.out.println(nameField.getAnnotatedType());
        nameField.setAccessible(true);
        System.out.println(nameField.get(user));
        nameField.set(user, "Fake User");
        System.out.println(nameField.get(user));
        Constructor<? extends User> constructor = userClass.getConstructor(String.class, String.class, String.class);
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        User user2 = constructor.newInstance("test", "pass", "FakeTest");
        Class<?> storageClass = Class.forName("de.telran.khakov.rustam.classworks.cw32.Storage");
        Constructor<?> constructor1 = storageClass.getConstructor();
        Object o = constructor1.newInstance();
        System.out.println(user2);


        for (Method declaredMethod : userClass.getDeclaredMethods()) {
            Arrays.stream(declaredMethod.getParameters()).forEach(System.out::println);
            System.out.println(declaredMethod);
        }
        Method setEmail = userClass.getDeclaredMethod("setEmail", String.class);
        System.out.println(user);
        setEmail.invoke(user, "fake email");
        System.out.println(user);


        Class<Database> databaseClass = Database.class;
        Annotation[] annotations = databaseClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }


    }
}
