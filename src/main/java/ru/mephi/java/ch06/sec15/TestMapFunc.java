package ru.mephi.java.ch06.sec15;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMapFunc {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("123", "12345", "0"));
        ArrayList<Integer> res = MapFunc.map(strings, String::length);

        System.out.println(res);
    }
}
