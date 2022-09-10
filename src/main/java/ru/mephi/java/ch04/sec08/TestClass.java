package ru.mephi.java.ch04.sec08;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(String[].class.getName());
        System.out.println(String.class.getName());
        System.out.println();

        System.out.println(int[].class.getName());
        System.out.println(int.class.getName());
        System.out.println(int.class.toGenericString());
    }
}
