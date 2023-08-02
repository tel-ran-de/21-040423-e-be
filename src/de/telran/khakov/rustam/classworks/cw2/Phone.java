package de.telran.khakov.rustam.classworks.cw2;

public class Phone {
    private String number;
    protected String model;
    int weight;

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String whoCall) {
        System.out.println("Звонит " + whoCall);
    }

    public String getModel() {
        return "Телефонная модель " + model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Phone phoneTest = new Phone();
        phoneTest.receiveCall("Петя");
        String str = "fafs";
    }
}
