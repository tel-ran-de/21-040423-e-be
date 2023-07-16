package de.telran.khakov.rustam.classworks.cw1;

public class CatTest {
    public CatTest() {
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Barsik");
        System.out.println(cat.getName());
    }
}
