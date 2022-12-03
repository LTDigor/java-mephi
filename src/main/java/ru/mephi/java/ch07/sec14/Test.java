package ru.mephi.java.ch07.sec14;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = GetList.getIntegerList(5);

        System.out.println(list.get(4));
        try {
            System.out.println(list.get(6));
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(list.add(6));
        }
        catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
