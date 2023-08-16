package de.telran.khakov.rustam.homeworks.homework4.atm;


import de.telran.khakov.rustam.homeworks.homework2.card.CreditCard;

public interface Atm {

    boolean takeCard(CreditCard card, int pinCode);

    CreditCard returnCard();

    int checkBalance();

    int withdrawCash(int cash);

    int depositCash(int deposit);

    void addCash(String keyPass, int sum);
}
