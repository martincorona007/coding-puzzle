package org.example.E19;

public class Motorcycle extends Vehicle{
    private double engineDisplacement;
    public Motorcycle(String make,String model,int year,String fuel_type,double fuelEfficiency){
        super(make, model, year, fuel_type, fuelEfficiency);

    }
    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()* (1.0/(1.0+(getEngineDisplacement()/1000.0)));
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
