package gr.aueb.cf.ch16.taggedclasses;

import gr.aueb.cf.ch5.PowerRecursiveApp;

public class Shape {

    private enum Type { RECTANGLE, CIRCLE }

    //tag field
    private final Type type;

    //fields for rectangle
    private double width;
    private double height;

    //fields for circle

    private double radius;

    //constructor for rectangle
    public Shape(double width, double height) {
        type = Type.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    //constructor for circle
    public Shape(double radius) {
        type = Type.CIRCLE;
        this.radius = radius;
    }

    public Type getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        switch (type) {

            case RECTANGLE :
                return width * height;
            case CIRCLE:
                return Math.PI * radius * radius;
            default:
                throw new AssertionError(type);
        }
    }
}
