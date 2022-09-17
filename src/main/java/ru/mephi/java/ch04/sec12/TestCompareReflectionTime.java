package ru.mephi.java.ch04.sec12;

import java.lang.reflect.Method;

public class TestCompareReflectionTime {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Hello world");
        long endTime = System.nanoTime();

        System.out.println(endTime- startTime);
        System.out.println();

        long startTimeReflection = System.nanoTime();
        try {
            //get out
            Object foundedOut = Class.forName("java.lang.System").getDeclaredField("out").get(null);

            //get method
            Method foundedPrintln = foundedOut.getClass().getDeclaredMethod("println", String.class);

            //print
            foundedPrintln.invoke(foundedOut, "Hello world!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTimeReflection = System.nanoTime();
        System.out.println(endTimeReflection- startTimeReflection);
        System.out.println();

        double coefficient = (endTimeReflection - startTimeReflection) / ((double) (endTime - startTime));
        System.out.println(coefficient);
    }
}
