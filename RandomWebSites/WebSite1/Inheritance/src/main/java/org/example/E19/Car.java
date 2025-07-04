package org.example.E19;

public class Car extends Vehicle{
    private int numSeats;

    public Car(String make,String model,int year,String fuel_type,double fuelEfficiency,int numSeats){
        super(make, model, year, fuel_type, fuelEfficiency);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0/(1.0+(getNumSeats()/5.0)));
    }

    @Override
    public double distanceTraveled() {
        return calculateFuelEfficiency()*getFuelEfficiency();
    }

    @Override
    public double maximumSpeed() {
        return 120.0;
    }
}
