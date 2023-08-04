package de.telran.khakov.rustam.classworks.cw3;

import java.io.Serializable;

public class Person implements Jumpable, Danceable, Serializable, Cloneable {

    @Override
    public void jump() {
        System.out.println("я прыгаю на 1 метр");
    }

    @Override
    public void jump(int length) {
        System.out.println("я прыгаю на " + length + " метров");
    }

    @Override
    public void dance() {
        System.out.println("я танцую");
    }
}
