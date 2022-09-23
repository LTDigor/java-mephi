package ru.mephi.java.ch04.sec13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintTable {
    public static void printTable(Method method, double minVal, double maxVal, double step) throws InvocationTargetException, IllegalAccessException {
        System.out.println(method.getName());
        for (double val = minVal; val <= maxVal; val += step) {
            System.out.println(val + " " + method.invoke(null, val));
        }
    }
}
