package org.example;

import org.example.E12.Vehicule;
import org.example.E13.Rectangule;
import org.example.E13.Shape;
import org.example.E14.HRManager;
import org.example.E15.BankAccount;
import org.example.E15.SavingsAccount;
import org.example.E16.Animal;
import org.example.E16.Cheetah;
import org.example.E17.Employee;
import org.example.E18.Circle;
import org.example.E19.Car;
import org.example.E19.Motorcycle;
import org.example.E19.Truck;
import org.example.E20.Developer;
import org.example.E20.Manager;
import org.example.E20.Programmer;

public class Main {
    public static void main(String[] args) {
        //E20
        Developer developer = new Developer("Patrick","Texas",10000,"SWE","HTML");
        Manager manager = new Manager("Devi","Wisconsin",20000,"Manager",7);
        Programmer programmer = new Programmer("Takashi","Californnia",500000,"Programer","Python");

        //Bonus
        System.out.println(" "+developer.calculateBonus());
        System.out.println(" "+manager.calculateBonus());
        System.out.println(" "+programmer.calculateBonus());
        //performance report
        System.out.println(" "+developer.performanceReports());
        System.out.println(" "+manager.performanceReports());
        System.out.println(" "+programmer.performanceReports());
        //projects
        developer.writeCode();
        manager.manageProject();
        programmer.debugCode();
        //E19 Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
//        Truck truck = new Truck("CyberTruck","3 motors",2025,"eletric",0,4.5);
//        Car car = new Car("Nissan","Tsuru",2014,"HYBRID",2.4,5);
//        Motorcycle motorcycle =new Motorcycle("Takashi","nakamoto",2020,"GASOLINE",2.1);

//        // Print the truck's model
//        System.out.println("Truck Model: " + truck.getModel());
//        // Print the truck's calculated fuel efficiency
//        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
//        // Print the truck's calculated distance traveled
//        System.out.println("Distance Traveled: " + truck.distanceTraveled() + " miles");
//        // Print the truck's maximum speed
//        System.out.println("Max Speed: " + truck.maximumSpeed() + " mph\n");
//
//        // Print the car's model
//        System.out.println("Truck Model: " + car.getModel());
//        // Print the truck's calculated fuel efficiency
//        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
//        // Print the truck's calculated distance traveled
//        System.out.println("Distance Traveled: " + car.distanceTraveled() + " miles");
//        // Print the truck's maximum speed
//        System.out.println("Max Speed: " + car.maximumSpeed() + " mph\n");
//
//        // Print the motorcycle's model
//        System.out.println("Truck Model: " + motorcycle.getModel());
//        // Print the truck's calculated fuel efficiency
//        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
//        // Print the truck's calculated distance traveled
//        System.out.println("Distance Traveled: " + motorcycle.distanceTraveled() + " miles");
//        // Print the truck's maximum speed
//        System.out.println("Max Speed: " + motorcycle.maximumSpeed() + " mph\n");

        //E18  Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
//        double r = 8.0;
//        Circle c1 = new Circle(r);
//        System.out.println(" "+r);
//        System.out.println(" "+c1.getPerimeter());
//        System.out.println(" "+c1.getArea());
//        r = 3.2;
//        Circle c2 = new Circle(r);
//        System.out.println(" "+r);
//        System.out.println(" "+c2.getPerimeter());
//        System.out.println(" "+c2.getArea());


        //E17 Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
//        Employee employee1 = new Employee("Chris","kyle",42,"SEAL Sniper");
//        System.out.println("> "+employee1.getFirstName()+" "+employee1.getLastName()+" "+employee1.getEmployeeId()+" "+employee1.getEmployeeTitle());
//        Employee employee2 = new Employee("Bravo","one",4232,"SEAL Warrior");
//        System.out.println("> "+employee2.getFirstName()+" "+employee2.getLastName()+" "+employee2.getEmployeeId()+" "+employee2.getEmployeeTitle());

        //E16 Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run
//        Animal animal = new Animal();
//        animal.move();
//
//        Cheetah cheetah = new Cheetah();
//        cheetah.move();
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