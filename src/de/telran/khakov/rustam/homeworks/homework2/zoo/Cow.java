package de.telran.khakov.rustam.homeworks.homework2.zoo;

import java.util.Objects;

public class Cow extends Herbivore {
    private int age;
    public Cow() {
    }

    public Cow(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("muu");
    }


    @Override
    public int jump() {
        return 1;
    }

    @Override
    public int jump(int length) {
        return jump();
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cow cow = (Cow) o;
        return age == cow.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }
}
