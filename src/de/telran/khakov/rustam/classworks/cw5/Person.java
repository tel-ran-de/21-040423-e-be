package de.telran.khakov.rustam.classworks.cw5;

public class Person implements Cloneable {
    private int age;
    private String firstName;
    private String lastName;
    private BankAccount bankAccount;

    public Person(int age, String firstName, String lastName, BankAccount bankAccount) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankAccount = bankAccount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }

    @Override
    public Person clone() throws CloneNotSupportedException { // Shadow Copy
        Person cloned = (Person) super.clone();
        cloned.bankAccount = cloned.getBankAccount().clone();
        // Deep Copy
        return cloned;
    }
}
