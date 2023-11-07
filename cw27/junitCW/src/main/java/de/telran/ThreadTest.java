package de.telran;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("привет с другого потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("подождал");
            }
        };
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyThread2());
        Thread thread3 = new Thread(() -> {
            System.out.println("Hi from func interface)");
        });
        thread.start();//
        thread1.start();//
        thread2.start();
        thread3.start();


        System.out.println("основной поток умер");
    }
}
