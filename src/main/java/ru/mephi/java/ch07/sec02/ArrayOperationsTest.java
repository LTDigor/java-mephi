package ru.mephi.java.ch07.sec02;


import java.util.*;

public class ArrayOperationsTest {
    public static void main(String[] args) {
        // with iterator
        List<String> strings1 = Arrays.asList("dfdfe@2EWDED", "dffeWDWDWDfef");
        ListIterator<String> iterator = strings1.listIterator();

        while (iterator.hasNext()) {
            String uppString = iterator.next().toUpperCase();
            iterator.set(uppString);
        }
        System.out.println(strings1);

        // with for loop
        List<String> strings2 = Arrays.asList("dfdfe@2EWDED", "dffeWDWDWDfef");

        for (int i = 0; i < strings2.size(); i++) {
            String uppString = strings2.get(i).toUpperCase();
            strings2.set(i, uppString);
        }
        System.out.println(strings2);

        // with replaceAll
        List<String> strings3 = Arrays.asList("dfdfe@2EWDED", "dffeWDWDWDfef");
        strings3.replaceAll(String::toUpperCase);
        System.out.println(strings3);
    }
}
