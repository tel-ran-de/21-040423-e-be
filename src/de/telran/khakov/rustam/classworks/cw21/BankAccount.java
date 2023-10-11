package de.telran.khakov.rustam.classworks.cw21;

public class BankAccount {
    private int balance;

    private final String email;

    public BankAccount(int balance, String email) {
        this.balance = balance;
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) throws NegativeAccountBalanceException {
        if (balance < 0) {
            NegativeAccountBalanceException ex = new NegativeAccountBalanceException(balance);
            throw ex;
        }
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }
}
