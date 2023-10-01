package de.telran.khakov.rustam.classworks.cw19;

public class Phone {
    int weight;
    String name;

    public Phone(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
