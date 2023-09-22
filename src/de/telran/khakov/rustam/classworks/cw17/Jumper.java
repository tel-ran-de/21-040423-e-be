package de.telran.khakov.rustam.classworks.cw17;

public class Jumper {
    private int length;

    public Jumper(int length) {
        this.length = length;
    }

    public void jump() {
        System.out.println("jump " + length);
    }

    public int getLength() {
        return length;
    }
}
