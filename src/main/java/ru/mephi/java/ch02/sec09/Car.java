package ru.mephi.java.ch02.sec09;

public class Car {
    private final double fuelConsumption;
    private double distance = 0, fuelLevel = 0;

    Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void goForward(double km) {
        if (fuelLevel * fuelConsumption <= km ) {
            distance += fuelLevel * fuelConsumption;
            fuelLevel = 0;
        }
        else {
            distance += km;
            fuelLevel -= km / fuelConsumption;
        }
    }

    public void fillTank(double liters) {
        fuelLevel += liters;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelLevel() {
        return  fuelLevel;
    }
}
