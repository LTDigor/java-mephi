package ru.mephi.java.ch04.sec13;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        PrintTable.printTable(Math.class.getMethod("sqrt", double.class),  0.0, 100.0, 20.0);
        System.out.println();
        PrintTable.printTable(Double.class.getMethod("toHexString", double.class),  0.0, 100.0, 20.0);
    }
}
