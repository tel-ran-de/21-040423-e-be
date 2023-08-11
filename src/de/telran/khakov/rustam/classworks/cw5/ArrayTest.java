package de.telran.khakov.rustam.classworks.cw5;

import de.telran.khakov.rustam.classworks.cw1.Cat;

public class ArrayTest {

    public static void main(String[] args) {
        Object[] array = new Object[10];
        array[0] = new Person(0,"","",new BankAccount(0,0));
        array[1] = new Cat();
        array[2] = "test";
        for (Object obj : array) {
            System.out.println(obj);
        }
        int[] integers = {1, 14, 15, 13, 24};
        for (int i = 0; i < integers.length; i++) {
            int integer = integers[i];
        }
//        for (int current : integers) {
//
//        }
    }
}
