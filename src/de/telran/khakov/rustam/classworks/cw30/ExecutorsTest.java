package de.telran.khakov.rustam.classworks.cw30;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorsTest {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        Executors.newCachedThreadPool(
//                new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//
//                return null;
//            }
//        }
        );
        Queue<Integer> list = new ArrayBlockingQueue<>(200);
        for (int i = 0; i < 200; i++) {
            list.add(new Random().nextInt(1000));
        }




        List<Future<Integer>> results = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> futureRes = executor.submit(()->{
                try {
                    //results.get(0).get(100, TimeUnit.MINUTES);
                    int res = list.poll() + list.poll();
                    Thread.sleep(100);
                    System.out.println("test - " + Thread.currentThread().getName());
                    return res;
                } catch (Exception e) {
                    System.out.println(e);
                    return 0;
                }
            });
            results.add(futureRes);
        }
        try {
            Integer res = results.get(0).get(1, TimeUnit.MINUTES);

            System.out.println("recieved = " + res);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
//        try {
//            executor.awaitTermination(10, TimeUnit.MINUTES);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        executor.shutdown();
    }
}
