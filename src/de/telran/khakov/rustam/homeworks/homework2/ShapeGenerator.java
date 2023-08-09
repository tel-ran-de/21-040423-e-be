package de.telran.khakov.rustam.homeworks.homework2;

import de.telran.khakov.rustam.classworks.cw2.shapes.Circle;
import de.telran.khakov.rustam.classworks.cw2.shapes.Shape;
import de.telran.khakov.rustam.classworks.cw2.shapes.Square;
import de.telran.khakov.rustam.classworks.cw2.shapes.Triangle;

import java.util.Random;

public class ShapeGenerator {

    public Shape generate(){
        Random random = new Random();
        int number = random.nextInt(3);
        return switch (number){
            case 0 -> new Circle(2);
            case 1 -> new Square(3);
            case 2 -> new Triangle(3,4,5);
            default -> null;
        };
    }

    public static void main(String[] args) {
        ShapeGenerator generator = new ShapeGenerator();
        generator.generate().draw();
        generator.generate().draw();
        generator.generate().draw();
        generator.generate().draw();
        generator.generate().draw();
        generator.generate().draw();
        generator.generate().draw();
        generator.generate().draw();

    }
}
