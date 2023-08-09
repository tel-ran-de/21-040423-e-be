package de.telran.khakov.rustam.classworks.cw4;

import de.telran.khakov.rustam.homeworks.homework2.zoo.Animal;
import de.telran.khakov.rustam.homeworks.homework2.zoo.Cow;
import de.telran.khakov.rustam.homeworks.homework2.zoo.Dog;

public class PrimitiveTest {
    public static void main(String[] args) {
        boolean b = false; // primitive
        Boolean b2 = false; // object
        Integer i2 = new Integer(1);

        Object[] array = new Object[3];
        int[] primitiveArray = new int[4];
        Animal animal; // null
        animal = new Cow("burenka", "white");
        Animal animal1 = animal;//
        Animal animal2 = new Dog(); // null
        System.out.println(animal2);

        System.out.println(animal1);//
        animal1.setColor("black");
        System.out.println(animal1);
        System.out.println(animal);// Cow{name='burenka', color='black'}

        int i = 1;
        int i3 = i;
        System.out.println(i3);
        i3 = 2;
        System.out.println(i3);
        System.out.println(i);
        //array[0] = 1;

        //
    }
}
