package de.telran;

import java.net.URL;

public class Card {
    private String pin;
    private int sum;

    public Card(String pin) {
        this.pin = pin;
    }

    public boolean isCorrectPinCode(String pincode) {
        return pin.equals(pincode);
    }

    //
    public int makeTransaction(String pin, int sum) {
        if (pin.equals(this.pin)) {
            //new URL("").openConnection().getInputStream()
            //check sum from server
            // 1-5 sec from server
            // check
            // make trans -> //
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return sum;
        }
        return -1;
    }

    public void addSum(int sum) {
        this.sum += sum;
    }

    public int getSum(String pin) {
        if (isCorrectPinCode(pin)) {
            return sum;
        } else {
            return -1;
        }
    }
}
