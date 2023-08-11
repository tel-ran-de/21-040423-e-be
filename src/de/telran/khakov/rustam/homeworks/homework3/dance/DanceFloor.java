package de.telran.khakov.rustam.homeworks.homework3.dance;

public class DanceFloor {
    public static void main(String[] args) {
        Danceable[] dancers = new Danceable[2];
        dancers[0] = new Dancer();
        dancers[1] = new PopDancer();
        for (Danceable dancer : dancers) {
            dancer.dance();
        }
    }
}
