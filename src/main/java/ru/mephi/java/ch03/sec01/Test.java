package ru.mephi.java.ch03.sec01;

public class Test {
    public static void main(String[] args) {
        Employee ivan = new Employee();
        ivan.setSalary(1000);

        Employee eva = new Employee();
        eva.setSalary(500);

        Employee[] employees = new Employee[2];
        employees[0] = eva;
        employees[1] = ivan;

        System.out.println("Ivan: " + eva.getMeasure());
        System.out.println("Average: " + Measurable.average(employees));
        System.out.println("Max salary: " + Measurable.largest(employees));
    }
}
