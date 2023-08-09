package de.telran.khakov.rustam.homeworks.homework2.zoo;

public class Lamb extends Herbivore {
    @Override
    public void voice() {
        System.out.println("beee");
    }

    @Override
    public int jump() {
        return 1;
    }

    @Override
    public int jump(int length) {
        return length;
    }
}
