package de.telran.khakov.rustam.classworks.cw30;

import java.util.List;

public class MsgSender implements Runnable {
    private List<String> msgToSend;
    private Envelope envelope;

    public MsgSender(List<String> msgToSend, Envelope envelope) {
        this.msgToSend = msgToSend;
        this.envelope = envelope;
    }

    @Override
    public void run() {
        for (String s : msgToSend) {
            try {
                envelope.send(s);
            } catch (InterruptedException e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
            }
        }
    }
}
