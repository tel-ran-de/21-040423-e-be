package de.telran.khakov.rustam.classworks.cw30;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Envelope envelope = new Envelope();
        List<String> msgs = List.of("Hi","my name is Artur Conan Dole", "What about you?", ".");
        Thread sender = new Thread(new  MsgSender(msgs, envelope));
        Thread reciever = new Thread(new MsgReciever(envelope));
        sender.start();
        reciever.start();
    }
}
