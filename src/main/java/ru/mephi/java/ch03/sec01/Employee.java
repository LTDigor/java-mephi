package ru.mephi.java.ch03.sec01;

public class Employee implements Measurable{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
