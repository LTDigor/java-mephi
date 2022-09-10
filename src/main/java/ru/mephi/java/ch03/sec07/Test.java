package ru.mephi.java.ch03.sec07;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("1", "22", "fff", "www", "eeee"));

        LuckySort.luckySort(strings, (String first, String second) -> first.length() - second.length());
        System.out.println(strings);
    }
}
