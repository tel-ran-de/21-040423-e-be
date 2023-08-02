package de.telran.khakov.rustam.homeworks.tasks.homework1;

public class Phone {
    private String number;
    String model;
    int weight;

    void receiveCall(String whoCall) {
        System.out.println("Звонит " + whoCall);
    }

    public static void main(String[] args) {
        Phone phoneTest = new Phone();
        phoneTest.receiveCall("Петя");
        String str = "fafs";
    }
}
