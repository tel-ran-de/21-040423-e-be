package de.telran.khakov.rustam.homeworks.homework4.cards;

public final class PlayerCard {
    private final Suit suit;
    private final Rank rank;

    public PlayerCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "suit=" + suit.getName() + ", rank=" + rank.getRank();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
}
