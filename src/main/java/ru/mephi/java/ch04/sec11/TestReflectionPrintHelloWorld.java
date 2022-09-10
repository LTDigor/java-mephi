package ru.mephi.java.ch04.sec11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflectionPrintHelloWorld {
    public static void main(String[] args) {
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
    }
}
