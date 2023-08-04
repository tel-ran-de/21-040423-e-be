package de.telran.khakov.rustam.classworks.cw2.shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Круг");
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(int radius, String type) {
        super(type);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Я рисую круг радиусом %d%n", radius);
    }

    public void drawFast() {
        System.out.println("Начал быстро рисовать");
        draw();
    }

    @Override
    public String toString() {
        return "это Круг радиусом " + radius;
    }


    int draw(Object color){
        return 1;
    }
}
