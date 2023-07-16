package de.telran.khakov.rustam.classworks.cw1;


public class Student {
    static final String TYPE = "University Student";
    String name;
    int age;
    String rate;

    Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student() {
    }

    public void happyBirthday() {
        ++this.age;
    }

    public int getAge() {
        return this.age;
    }

    public void sayHello() {
        System.out.println("Hello my name is " + this.name);
    }
}
