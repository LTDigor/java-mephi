package ru.mephi.java.ch07.sec16;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = GetListCache.getIntegerList((x) -> x*x, 2);
        list.get(4);
        list.get(5);
        list.get(4);
        // size of cache will still be 2!
        list.get(6);
    }
}
