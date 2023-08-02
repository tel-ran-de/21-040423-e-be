package de.telran.khakov.rustam.classworks.cw2.shapes;

public class Triangle extends Shape {
    private int first;
    private int second;
    private int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем треугольник со сторонами %d, %d, %d%n", first, second, third);
    }
}
