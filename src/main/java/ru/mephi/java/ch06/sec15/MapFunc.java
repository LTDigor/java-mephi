package ru.mephi.java.ch06.sec15;

import java.util.ArrayList;
import java.util.function.Function;

public class MapFunc {
    public static <T, R> ArrayList<R> map(ArrayList<T> arrayList, Function<T, R> function) {
        ArrayList<R> res = new ArrayList<>(arrayList.size());
        for(T item: arrayList) {
            res.add(function.apply(item));
        }

        return res;
    }
}
