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

        for (int i = '0'; i <='9' ; i++) {
            System.out.println(" "+i+" "+(i-48));
        }
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5 - i; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }
//        System.out.println("Hello, World!");
//
//        Rectangule r = new Rectangule(2.0, 3.0);
//        System.out.println(r.getLength() + " " + r.getWidth());
//        Rectangule r1 = new Rectangule(r.length,r.width);
//        System.out.println(r.getLength() + " " + r.getWidth());
    }
}