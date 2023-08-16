package de.telran.khakov.rustam.homeworks.homework4.cards;

import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        deck.init();
        deck.shuffle();
        while (true) {
            System.out.println("Enter the number of players: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= deck.getNumberOfCards() && players > 0) {
                    deck.display(players, cardsForPlayer);
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
    }
}