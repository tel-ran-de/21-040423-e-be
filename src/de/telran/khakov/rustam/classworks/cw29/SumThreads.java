package de.telran.khakov.rustam.classworks.cw29;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class SumThreads {
    private static AtomicLong sum = new AtomicLong();
    private static final String lock = "test";
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
//        long before = System.currentTimeMillis();
//        for (int i = 0; i < 100_000; i++) {
//            sum += i;
//        }
        Thread thread1 = new Thread(sum(0, 50_000));
        Thread thread2 = new Thread(sum(50_000, 100_000));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        //3_224_872_379
        //2_960_691_029

        System.out.println(sum.get());//49_995_000
        //49_995_000
        //4_999_950_000
//        System.out.println(System.currentTimeMillis() - before);

    }
    public static Runnable sum(int from, int to) {
        return () -> {
            for (int i = from; i < to; i++) {
                sum(i);
//                synchronized (lock) {
////                    sum = sum + i;//    sum = 100     thread 1:    +10   110    thread 2:    +130    230
//                }
            }
        };
    }

    private static void sum(int i) {
        sum.addAndGet(i);//get value add int, set value

    }
}
