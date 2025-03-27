package org.example.E13;

public class Rectangule extends Shape {

    private double length;
    private double width;

    public Rectangule(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
}
