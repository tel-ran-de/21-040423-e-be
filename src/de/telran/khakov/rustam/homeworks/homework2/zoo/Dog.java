package de.telran.khakov.rustam.homeworks.homework2.zoo;

public class Dog extends Predator {
    @Override
    public void voice() {
        System.out.println("gav");
    }

    @Override
    public int jump() {
        return 1;
    }

    @Override
    public int jump(int length) {
        return length * 2;
    }
}
