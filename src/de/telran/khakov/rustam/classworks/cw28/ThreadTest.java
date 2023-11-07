package de.telran.khakov.rustam.classworks.cw28;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("привет с другого потока!");
            }
        };
        thread.run();

    }
}
