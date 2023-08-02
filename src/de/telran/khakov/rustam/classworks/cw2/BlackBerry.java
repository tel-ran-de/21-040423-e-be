package de.telran.khakov.rustam.classworks.cw2;

public class BlackBerry extends Phone {
    public BlackBerry(String number, String model, int weight) {
        super(number, model, weight);
    }

    @Override
    void receiveCall(String whoCall) {
        super.receiveCall(whoCall);
    }



    public final void sendMsg(String msg) {
        System.out.println("send cipher msg");
        ///
    }
}
