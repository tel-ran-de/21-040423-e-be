package de.telran.khakov.rustam.homeworks.homework2.zoo;

public abstract class Predator extends Animal {

    @Override
    public void eat(String food) {
        System.out.println("I am eating " + food);
    }
}
