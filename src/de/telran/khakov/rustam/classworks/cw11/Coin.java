package de.telran.khakov.rustam.classworks.cw11;

public class Coin {
    int number;

    public Coin(int number) {
        this.number = number;
    }

    public Coin() {
    }

    @Override
    public String toString() {
        return "Coin{" +
                "number=" + number +
                '}';
    }
}
