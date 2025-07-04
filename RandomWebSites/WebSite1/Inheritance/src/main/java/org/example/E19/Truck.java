package org.example.E19;

public class Truck extends Vehicle{
    private double cargoCapcity;

    public Truck(String make,String model,int year,String fuel_type,double fuelEfficiency, double cargoCapacity){
        super(make, model, year, fuel_type, fuelEfficiency);
        this.cargoCapcity = cargoCapacity;
    }

    public double getCargoCapcity() {
        return cargoCapcity;
    }

    public void setCargoCapcity(double cargoCapcity) {
        this.cargoCapcity = cargoCapcity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0/(1.0+getCargoCapcity()/1000.0));
    }

    @Override
    public double distanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double maximumSpeed() {
        return 80.0;
    }
}
