package ru.mephi.java.ch06.sec06;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAppender {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("1234", "12345", "123456"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("1234", "12345", "123456"));

        Appender.appendExtends(arr1, arr2);
        System.out.println(arr1);

        Appender.appendSuper(arr1, arr2);
        System.out.println(arr1);
    }
}
