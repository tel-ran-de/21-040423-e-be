package de.telran.khakov.rustam.classworks.cw2.shapes;

public abstract class Shape {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    public Shape() {
    }

    public abstract void draw();

    public abstract double calculateArea();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shape: " + type;
    }
}
