package de.telran.khakov.rustam.classworks.cw2.shapes;

import java.util.Scanner;

public class ShapesTest {
    public static void main(String[] args) {
        Circle smallCircle = new Circle(3);
        Circle bigCircle = new Circle(10);
        Triangle smallTriangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(3, 5);
        smallCircle.draw();
        bigCircle.draw();
        smallTriangle.draw();
        rectangle.draw();
        //Shape shape = new Shape();
        // Создай фигуру - круг радиусом 7, назови ее средний круг
        // Создай фигуру - квадрат стороной 6, назови ее квадрат
        // Нарисуй фигуру средний круг
        // Нарисуй фигуру квадрат
        Shape middleCircle = new Circle(7);
        Shape square = new Square(6);

        Shape[] shapes = new Shape[2];
        shapes[0] = middleCircle;
        shapes[1] = square;
        System.out.println();
        for (int i = 0; i < shapes.length; i++) {
            drawShape(shapes[i]);
        }
        //Shape circle = generate();
        //circle.draw();
        //circle.drawFast();
        Circle dot = new Dot();
        dot.draw("str");
    }


    public static Shape generate() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 1) {
            return new Circle(3);
        } else {
            return new Rectangle(2, 3);
        }

    }


    public static void drawShape(Shape shape) {
        System.out.println("Я начинаю рисовать фигуру " + shape.type);
        shape.draw();
        System.out.println(shape);//de.telran.khakov.rustam.classworks.cw2.shapes.Circle@1342fda2
        System.out.println("Я закончил рисовать фигуру");
    }
}
