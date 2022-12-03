package ru.mephi.java.ch07.sec17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCheckedList {
    public static void main(String[] args) {
        List<String> strings = Collections.checkedList(new ArrayList<>(), String.class);
        List<Integer> integerList = (List<Integer>)((Object) strings);
        try {
            integerList.add(111);
        }
        catch (ClassCastException e) {
            e.printStackTrace();
        }

        List<String> stringsUnchecked = new ArrayList<>();
        List<Integer> integerListUnchecked = (List<Integer>)((Object) stringsUnchecked);
        integerListUnchecked.add(111);

        System.out.println(stringsUnchecked);
    }
}
