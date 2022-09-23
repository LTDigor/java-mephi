package ru.mephi.java.ch04.sec09;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PrintAllFields {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass myClass = new MyClass();

        Class<?> cl = myClass.getClass();
        while (cl != null) {
            for (Field field : cl.getDeclaredFields()) {
                field.setAccessible(true);
                System.out.println(
                        Modifier.toString(field.getModifiers()) + " " +
                        field.getAnnotatedType() + " " +
                        field.getName());
            }
            cl = cl.getSuperclass();
        }
    }
}
