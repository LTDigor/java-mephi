package ru.mephi.java.ch07.sec15;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class GetList {
    public static <R> List<R> getIntegerList(IntFunction<R> function) {
        return Collections.unmodifiableList(
                new AbstractList<>() {
                    @Override
                    public R get(int index) {
                        return function.apply(index);
                    }

                    @Override
                    public int size() {
                        throw new UnsupportedOperationException();
                    }
                }
        );
    }
}
