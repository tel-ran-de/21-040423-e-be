package de.telran.khakov.rustam.homeworks.homework2;

public class CreditCard {

    private int pinCode;
    private int balance;
    private int dept;
    private int creditLimit;

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        card.deposit(10, 123);
        card.withdraw(15);
        card.deposit(1, 123);
        card.deposit(1,123);
    }

    public void deposit(int sum, int pinCode) {// 10     1  1
        if (pinCode != this.pinCode) {
            return;
        }
        if (dept >0) {//10
            dept -= sum; // 8
            balance -= dept; //-17
        } else {
            ///
        }
    }

    public void withdraw(int sum) {

    }
}
