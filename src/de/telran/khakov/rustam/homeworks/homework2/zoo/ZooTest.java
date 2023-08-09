package de.telran.khakov.rustam.homeworks.homework2.zoo;

public class ZooTest {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.voice();
        cat.eat("meat");
        Animal cow = new Cow();
        cow.voice();
        cow.eat("meat");
    }
}
