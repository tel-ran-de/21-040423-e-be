package de.telran.khakov.rustam.classworks.cw2;

public class PhoneTest {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(""); // 1 объект или 2?
        smartPhone.receiveCall("Петя");
        System.out.println(smartPhone.getCalc().sum(2, 3));
    }
}
