package de.telran.khakov.rustam.classworks.cw2;

public class SmartPhone extends Phone {
    String internetProvider;
    Calculator calc;

    public SmartPhone(String internetProvider) {
        super("","",0);
        this.internetProvider = internetProvider;
        this.calc = new Calculator();
    }

    public void receiveCall(String whoCall) {
        System.out.println("уважаемый владелец смартфона");
        super.receiveCall(whoCall);
    }

    void googleInInternet() {
        System.out.println("я гуглю в интернете через" + this.model);
    }

    public Calculator getCalc() {
        return calc;
    }
}
