package ru.mephi.java.ch06.sec12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>(Arrays.asList("1234", "12345", "22"));
        Comparator<String> comp = (x, y) -> y.length() - x.length();
        ArrayList<String> res = new ArrayList<>(2);

        MinMax.minmax(elements, comp, res);
        System.out.println(res);

        MinMax.maxmin(elements, comp, res);
        System.out.println(res);
    }
}
