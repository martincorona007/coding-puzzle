package org.example.E19;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuel_type;
    private double fuelEfficiency;

    public Vehicle(String make,String model,int year,String fuel_type,double fuelEfficiency){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();
    public abstract double distanceTraveled();
    public abstract double maximumSpeed();
}
