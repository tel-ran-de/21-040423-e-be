package de.telran;

public class Printer {

    public Printer() {
        System.out.println("init dependencies phase");
    }

    public void doPrint() {
        System.out.println("I am printing current state");
    }

    public static Printer creator() {
        System.out.println("created from factory method");
        return new Printer();
    }
}
