package de.telran.khakov.rustam.homeworks.homework4.cards;

public enum Suit {

    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
