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
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - first)*
                (semiPerimeter - second) * (semiPerimeter - third));
    }

    public double calculatePerimeter() {
        return first + second + third;
    }


    @Override
    public void draw() {
        System.out.printf("Рисуем треугольник со сторонами %d, %d, %d%n", first, second, third);
    }
}
