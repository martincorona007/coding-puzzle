package org.example;

public class Rectangule {


    private double length;
    private double width;

    public Rectangule(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangule(Rectangule r) {
        this.length = r.length;
        this.width = r.width;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Rectangule r = new Rectangule(2.0, 3.0);
        System.out.println(r.getLength() + " " + r.getWidth());
        Rectangule r1 = new Rectangule(r.length,r.width);
        System.out.println(r.getLength() + " " + r.getWidth());
    }
}