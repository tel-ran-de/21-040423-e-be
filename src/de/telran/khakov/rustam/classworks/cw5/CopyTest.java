package de.telran.khakov.rustam.classworks.cw5;

public class CopyTest {


    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = findRandomInDatabase();
        Person[] clonedArray = new Person[4];
        for (int i = 11; i < 15; i++) {
            Person cloned = person.clone();
            cloned.setAge(i);
            clonedArray[i - 11] = cloned;
        }
        person.getBankAccount().setBalance(50);
        for (Person cloned : clonedArray) {
            System.out.println(cloned);
        }
        // 11  12 13
        //Person person2 = new Person(11, "Ivan", "Ivanov", bankAccount);


    }

    private static Person findRandomInDatabase() {
        return new Person(10, "Ivan", "Ivanov", new BankAccount(100, 12345));
    }
}
