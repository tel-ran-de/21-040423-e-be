package de.telran.khakov.rustam.classworks.cw30;

public class Envelope {
    private String text;
    private boolean isSent;
//    BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

    public synchronized void send(String msg) throws InterruptedException {
        while (isSent) {
            wait();
        }
        isSent = true;
        this.text = msg;
        System.out.printf("Msg sent from %s%n", Thread.currentThread().getName());
        //notifyAll();
        Thread.sleep(1000);
    }

    public synchronized boolean recieve() throws InterruptedException {
        while (!isSent) {
            wait(2_000);
        }
        System.out.printf("Msg is come to %s %s%n", Thread.currentThread().getName(), text);
        isSent = false;
        notifyAll();
        if (text.equals(".")) {
            return false;
        }
        text = null;
        Thread.sleep(1000);
        return true;
    }

    public synchronized boolean listener() throws InterruptedException {
        while (!isSent) {
            wait();
        }
        if (text.equals(".")) {
            return false;
        }
        notifyAll();
        return true;
    }
}
