package de.telran.khakov.rustam.homeworks.homework3.dance;

public class PopDancer extends Dancer implements Danceable, Singable {
    @Override
    public void sing() {
        System.out.println("I can sing");
    }

    @Override
    public void dance() {
        this.sing();
        super.dance();
    }
}
