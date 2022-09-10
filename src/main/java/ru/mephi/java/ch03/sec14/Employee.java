package ru.mephi.java.ch03.sec14;

public class Employee {
    public int salary;
    public String name;

    Employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
