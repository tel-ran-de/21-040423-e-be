package de.telran.khakov.rustam.classworks.cw2.shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Я рисую круг радиусом %d%n", radius);
    }
}
