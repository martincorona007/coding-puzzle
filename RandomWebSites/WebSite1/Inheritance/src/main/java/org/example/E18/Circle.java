package org.example.E18;

public class Circle extends Shape{

    private double radius;

    public Circle(double radios){
        this.radius = radios;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
