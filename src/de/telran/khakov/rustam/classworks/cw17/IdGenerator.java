package de.telran.khakov.rustam.classworks.cw17;

import java.util.Random;

public class IdGenerator {

    public static String generate() {
        Random random = new Random();
        try {
            getNumberApprove();// согласование номера
            numberRegister(); // регистрация номера
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Integer.valueOf(random.nextInt(1000)).toString();
    }

    private static void numberRegister() throws InterruptedException {
        Thread.sleep(10* 1000);
    }

    private static void getNumberApprove() throws InterruptedException {
        Thread.sleep(5* 1000);
    }
}
