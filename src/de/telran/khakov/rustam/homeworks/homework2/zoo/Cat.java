package de.telran.khakov.rustam.homeworks.homework2.zoo;

public class Cat extends Predator {
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("miay");
    }

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public int jump(int length) {
        return length * 3;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
