package ru.mephi.java.ch07.sec14;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

public class GetList {
    public static List<Integer> getIntegerList(int n) {
        return Collections.unmodifiableList(
                new AbstractList<>() {
                    private final int capacity = n;

                    @Override
                    public Integer get(int index) {
                        if (index >= 0 && index < n) {
                            return index;
                        }

                        throw new IndexOutOfBoundsException();
                    }

                    @Override
                    public int size() {
                        return capacity;
                    }
                }
        );
    }
}
