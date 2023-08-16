//package de.telran.khakov.rustam.homeworks.homework4.atm;
//
//
//import de.telran.khakov.rustam.homeworks.homework2.card.CreditCard;
//
//public final class SimpleAtm implements Atm {
//
//    private int cashLimit;
//    private CreditCard card;
//    private String passKey;
//
//    public SimpleAtm(int cashLimit, String passKey) {
//        this.cashLimit = cashLimit;
//        this.passKey = passKey;
//    }
//
//    @Override
//    public boolean takeCard(CreditCard card, int pinCode) {
//        if (card.checkPin(pinCode)) {
//            this.card = card;
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public CreditCard returnCard() {
//        CreditCard operatedCard = this.card;
//        if (operatedCard != null) {
//            this.card = null;
//            return operatedCard;
//        } else {
//            System.out.println("The card isn't inserted");
//            return null;
//        }
//    }
//
//    @Override
//    public int checkBalance() {
//        if (this.card != null) {
//            return this.card.getBalance();
//        } else {
//            System.out.println("Insert a credit card");
//            return -1;
//        }
//    }
//
//    @Override
//    public int withdrawCash(int withdrawal) {
//        if (card != null) {
//            if (card.getBalance() >= withdrawal && withdrawal <= cashLimit) {
//                int balance = card.getBalance() - withdrawal;
//                card.setBalance(balance);
//                cashLimit -= withdrawal;
//                return balance;
//            } else {
//                System.out.println("Insert other withdrawal");
//                return -1;
//            }
//        } else {
//            System.out.println("Insert a credit card");
//            return -1;
//        }
//    }
//
//    @Override
//    public int depositCash(int deposit) {
//        if (card != null) {
//            int balance = card.getBalance() + deposit;
//            card.setBalance(balance);
//            cashLimit += deposit;
//            return balance;
//        } else {
//            System.out.println("Insert a credit card");
//            return -1;
//        }
//    }
//
//
//    @Override
//    public void addCash(String keyPass, int sum) {
//        if (keyPass.equals(this.passKey)) {
//            cashLimit += sum;
//        }
//    }
//
//
//}
