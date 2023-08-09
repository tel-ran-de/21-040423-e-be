package de.telran.khakov.rustam.homeworks.homework2;

import de.telran.khakov.rustam.classworks.cw2.shapes.Shape3D;

public class Cube extends Shape3D {
    int size;

    public Cube(int size) {
        super("Cube");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("draw cube");
    }

    @Override
    public double calculateArea() {
        return 6 * size * size;
    }

    @Override
    public double volume() {
        return size * size * size;
    }
}
