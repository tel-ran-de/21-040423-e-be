package de.telran.khakov.rustam.classworks.cw2.shapes;

public abstract class Shape3D extends Shape {

    public Shape3D(String type) {
        super(type);
    }

    public Shape3D() {
    }

    public abstract double volume();
}
