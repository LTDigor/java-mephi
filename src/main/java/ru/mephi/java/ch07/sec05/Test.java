package ru.mephi.java.ch07.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Swapper.swap(arrayList, 0, 5);
        System.out.println(arrayList);

        List<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Swapper.swap(linkedList1, 0, 5);
        System.out.println(linkedList1);

        List<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Swapper.swap(linkedList2, 5, 6);
        System.out.println(linkedList2);
    }
}
