package de.telran.khakov.rustam.classworks.cw5;

public class StackTest {

    public StackTest() {
        new StackTest();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //StackTest test = new StackTest();
        int number = 10;
        Person person = new Person(10, "Ferdinand", "Fergisson", new BankAccount(100, 1000));
        calcNumber(number, person);// копию number и копию ссылки на person
//        Person[] persons = new Person[1_000_000];
//        for (int i = 0; i <persons.length; i++) {
//            persons[i] = new Person(10, "Ferdinand", "Fergisson", new BankAccount(100, 1000));
//        }
        System.out.println(number);
        System.out.println(person);
    }

    private static int calcNumber(int number, Person person2) {
        number = number + 10;
        person2.setAge(100);
        //person2 = new Person(100, "Neil", "Tovi", new BankAccount(100, 1000));
        return calcNumber2(number);
    }

    private static int calcNumber2(int val) {
        int num2 = 4;
        int num3 = 5;
        val = num3 + num2 + val;
        return val;
    }


}
