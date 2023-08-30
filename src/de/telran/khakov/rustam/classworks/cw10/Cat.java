package de.telran.khakov.rustam.classworks.cw10;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int birthYear;
    private int weight;

    public Cat(String name, int birthYear, int weight) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = weight;
    }

    public Cat(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = 4;
    }

    // Comparator<Cat>

    // по году рождения
    // если текущая кошка родилась раньше то она и должна идти раньше
    // если года одинаковые то равно
    // если же текущая кошка родилась позже, то она идет позже
    @Override
    public boolean equals(Object o) { // == !=
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return birthYear == cat.birthYear
                && weight == cat.weight
                && Objects.equals(name, cat.name);
    }

    @Override
    public int compareTo(Cat o) { // > < ==
        int diff = this.birthYear - o.birthYear;// 2022 - 2020 = 2
        return diff;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, weight);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getWeight() {
        return weight;
    }
}
