package org.example.E20;

public class Manager extends Employee{
    private int numberOfSubordinaries;


    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinaries) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinaries=numberOfSubordinaries;

    }
    @Override
    public double calculateBonus() {
        return getSalary()*0.15;
    }

    @Override
    public String performanceReports() {
        return "performance report fro Manager";
    }
    public void manageProject(){
        System.out.println("Manager"+getName()+" is managing a project.");
    }

}
