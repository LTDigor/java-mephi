package ru.mephi.java.exam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static ru.mephi.java.exam.Map_toMap.toMap;


public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("123", "234", "345"));
        Map<String, Integer> myMap =  toMap(strings, (String str)->"*" + str + "*", (String str) -> str.length());

        System.out.println(myMap);
    }

}
