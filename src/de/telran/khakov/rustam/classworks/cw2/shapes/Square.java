package de.telran.khakov.rustam.classworks.cw2.shapes;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        super("квадрат");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }
}
