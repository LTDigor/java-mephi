package ru.mephi.java.ch06.sec07;

import java.util.ArrayList;

public class Arrays {
    //or ArrayList<E> a
    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<? extends E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    //sec10
    public static <E extends Comparable<E>> E max(ArrayList<? extends E> arrayList) {
        E res = arrayList.get(0);
        for(E element: arrayList) {
            if (res.compareTo(element) < 0) {
                res = element;
            }
        }

        return res;
    }

    public static <E extends Comparable<E>> E min(ArrayList<? extends E> arrayList) {
        E res = arrayList.get(0);
        for(E element: arrayList) {
            if (res.compareTo(element) > 0) {
                res = element;
            }
        }

        return res;
    }
}
