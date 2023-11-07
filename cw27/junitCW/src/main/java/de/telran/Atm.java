package de.telran;

public class Atm {

    public void translateFromTo(Card cardFrom, String pincode, Card cardTo, int sum) {
        int transSum = cardFrom.makeTransaction(pincode, sum);
        cardTo.addSum(transSum);
    }
}
