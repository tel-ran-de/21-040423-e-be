package de.telran.khakov.rustam.classworks.cw2.shapes;

public class Square extends Shape {
    private int size;

    @Override
    public double calculateArea() {
        return size * size;
    }

    public Square(int size) {
        super("квадрат");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

}
