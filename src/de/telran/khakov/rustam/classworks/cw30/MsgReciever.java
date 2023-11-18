package de.telran.khakov.rustam.classworks.cw30;


public class MsgReciever implements Runnable {
    private Envelope envelope;

    public MsgReciever(Envelope envelope) {
        this.envelope = envelope;
    }

    @Override
    public void run() {
        try {
            while (true) {
                boolean recieve = envelope.recieve();
                if (!recieve) {
                    return;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
