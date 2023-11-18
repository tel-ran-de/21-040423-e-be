package de.telran.khakov.rustam.classworks.cw29;

public class MultiThreadTask {
    public static void main(String[] args) {
        Thread statisticGather = new Thread(gatherRun());

        statisticGather.setName("Gather Thread");
        statisticGather.setDaemon(true);
        statisticGather.start();
        statisticGather.setPriority(10);
        statisticGather.setUncaughtExceptionHandler((t, exc) -> {
                    System.out.println(exc);
                    Thread thread = new Thread(gatherRun());
                    thread.setDaemon(true);
                    thread.start();
                }
        );
        //statisticGather.getState();
        //statisticGather.interrupt();
        long sum = 0;
        TestLoadClass loadClass;
        for (int i = 0; i < 10_000; i++) {
            loadClass = new TestLoadClass();
            loadClass.test();
            sum += i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        System.out.println(sum);

    }

    private static Runnable gatherRun() {
        return () -> {
            while (true) {
                try {
                    System.out.println("Procesors: " + Runtime.getRuntime().availableProcessors());
                    System.out.println("Memeory Usage: " + Runtime.getRuntime().totalMemory());
                    System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());
                    System.out.println(Thread.currentThread().getName());
                    if (Runtime.getRuntime().freeMemory() < 537574208) {
                        System.out.println("!!!!!ALARM!!!!!");
                    }
                    Thread.sleep(1000);
                    throw new RuntimeException("test");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}
