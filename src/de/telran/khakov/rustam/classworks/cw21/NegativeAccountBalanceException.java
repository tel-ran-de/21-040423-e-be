package de.telran.khakov.rustam.classworks.cw21;

public class NegativeAccountBalanceException extends Exception {
    private int balance;
    public NegativeAccountBalanceException(int balance) {
        super("Somebody tried to set balance account to %s".formatted(balance));
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
