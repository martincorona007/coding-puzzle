package org.example.E14;

public class Employee {
    private double salary;
    public Employee(double salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Working loading");
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}
