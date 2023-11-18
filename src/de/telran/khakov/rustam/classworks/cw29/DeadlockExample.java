package de.telran.khakov.rustam.classworks.cw29;

public class DeadlockExample {

    private static final Object lock1 = new Object();// blocked
    private static final Object lock2 = new Object();//blocked


    public static void main(String[] args) {
        new Thread(()->{
            synchronized (lock1) {
                System.out.println("test my program");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("test 2");
                }
            }
        }).start();


        new Thread(()->{
            synchronized (lock2) {
                System.out.println("test my program 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("test 1");
                }
            }
        }).start();
    }

}
