package de.telran.khakov.rustam.homeworks.homework4.cards;

import java.util.Random;

public class Deck {

    private final int numberOfCards;
    private final PlayerCard[] cards;

    public Deck() {
        numberOfCards = Suit.values().length * Rank.values().length;
        cards = new PlayerCard[numberOfCards];
    }

    public void init() {
        int current = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[current++] = new PlayerCard(suit, rank);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            PlayerCard temp = cards[card];
            cards[card] = cards[i];
            cards[i] = temp;
        }
    }

    public void display(int players, int cardsForPlayer) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cards[i]);
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }

    public PlayerCard[] getCards() {
        return cards;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }
}
