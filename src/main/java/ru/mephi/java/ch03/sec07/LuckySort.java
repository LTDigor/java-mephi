package ru.mephi.java.ch03.sec07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySort {
    public static void luckySort (ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> stringsSorted = new ArrayList<>(strings);
        stringsSorted.sort(comp);

        while(strings.equals(stringsSorted)) {
            Collections.shuffle(strings);
            stringsSorted = (ArrayList<String>) strings.clone();
            stringsSorted.sort(comp);
        }
    }
}
