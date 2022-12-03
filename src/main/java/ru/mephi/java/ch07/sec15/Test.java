package ru.mephi.java.ch07.sec15;


import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = GetList.getIntegerList((x) -> x*x);

        System.out.println(list.get(4));

        try {
            System.out.println(list.size());
        }
        catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Arrays.toString(list.toArray()));
        }
        catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
