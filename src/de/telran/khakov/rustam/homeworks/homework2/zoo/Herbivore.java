package de.telran.khakov.rustam.homeworks.homework2.zoo;

public abstract class Herbivore extends Animal {

    public Herbivore() {
    }

    public Herbivore(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("я не ем такое");
        } else {
            System.out.println(" я ем" + food);
        }
    }


}
