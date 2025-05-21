package org.example;

import org.example.E12.Car;
import org.example.E12.Vehicule;
import org.example.E13.Rectangule;
import org.example.E13.Shape;
import org.example.E14.HRManager;
import org.example.E15.BankAccount;
import org.example.E15.SavingsAccount;
import org.example.E16.Animal;
import org.example.E16.Cheetah;

public class Main {
    public static void main(String[] args) {
        //E16 Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run
        Animal animal = new Animal();
        animal.move();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
        //E15 Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
//        BankAccount BAN123 =new BankAccount("BAN123",300);
//
//        BAN123.withdraw(250);
//        System.out.println(""+BAN123.getBalance());
//
//        SavingsAccount BAN1234 =new SavingsAccount("BAN1234",100);
//        BAN1234.withdraw(250);
//        System.out.println(""+BAN1234.getBalance());

        //E14 Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
        //create the employee
//        HRManager emp1 = new HRManager(34000);
//        //add the employee
//        emp1.addEmployee();
//        emp1.work();
//        System.out.println("emp1.getSalary() = " + emp1.getSalary());
//
//        HRManager emp2 = new HRManager(35000);
//        emp1.addEmployee();
//        emp1.work();
//        System.out.println("emp2 = " + emp2.getSalary());
        //E13 Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
//        Rectangule rectangule = new Rectangule(5,6);
//        Shape shape = new Shape();
//        System.out.println(shape.getArea());
//        System.out.println(" "+ rectangule.getArea());
        //E12 Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
//        Car car = new Car();
//        car.drive();
//        Vehicule vehicule = new Vehicule();
//        vehicule.drive();
        //E11 Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
//        System.out.println("Hello, World!");
//        Cat cat = new Cat();
//        Animal animal = new Animal();
//        cat.makeSound();
//        animal.makeSound();



    }
}