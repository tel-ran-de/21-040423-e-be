package de.telran.khakov.rustam.classworks.cw29;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiThreadPrinter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            list.add(random.nextInt());
        }

        Thread thread = new Thread(print(0, 10_000, list));
        thread.setPriority(10);
        thread.start();
        new Thread(print(5_000, 10_000, list)).start();

    }

    public static Runnable print(int from, int to, List<Integer> list) {
        return () -> {
            String currentThreadName = Thread.currentThread().getName();
            for (int i = from; i < to; i++) {
                System.out.printf("thread: %s -- position: %s  value: %s%n", currentThreadName, i, list.get(i));
            }
        };
    }
}
