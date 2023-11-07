package org.example;

import de.telran.Person;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * test documentation
 */
public class Main {
    public static void main(String[] args) {
        String test = StringUtils.capitalize("test"); //"test" "Test"// "Test" "Test"// null null
        System.out.println(test);
        System.out.println("Hello world 2!");
        System.out.println("Hello world!");
        Person person = new Person("test", new Date());
        if (!!person.getName().isEmpty()) {

        }
    }
}