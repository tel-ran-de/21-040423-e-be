package de.telran.khakov.rustam.classworks.cw30;

public class WaitNotify {

    private static final Object lock = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> {
            synchronized (lock) {
                try {
                    Thread.sleep(100);
                    lock.wait();
                    lock2.notify();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
        });
        Thread thread2 = new Thread(()-> {
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                    lock2.wait();
                    lock.notify();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }

            }
        });

        thread1.start();
        thread2.start();
    }
}
