package ru.mephi.java.ch03.sec14;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayEmployees {
    public static void main(String[] args) {
        Employee ivan = new Employee(1000, "Ivan");
        Employee anton = new Employee(1000, "Anton");
        Employee ann = new Employee(100, "Ann");
        Employee zeya = new Employee(500, "Zeya");

        Employee[] employees = new Employee[]{ivan, ann, anton, zeya};
        for (Employee employee: employees) {
            System.out.println(employee.name + " " + employee.salary);
        }
        System.out.println();

        SortSalaryName(employees);
        for (Employee employee: employees) {
            System.out.println(employee.name + " " + employee.salary);
        }
        System.out.println();

        SortSalaryNameReverseSalary(employees);
        for (Employee employee: employees) {
            System.out.println(employee.name + " " + employee.salary);
        }
    }

    public static void SortSalaryName(Employee... employees) {
        Arrays.sort(employees, Comparator
                .comparing(Employee::getSalary)
                .thenComparing(Employee::getName));
    }

    public static void SortSalaryNameReverseSalary(Employee... employees) {
        Arrays.sort(employees, Comparator
                .comparing(Employee::getSalary)
                .reversed()
                .thenComparing(Employee::getName));
    }
}
