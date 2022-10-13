package ru.mephi.java.ch06.sec01;

import java.util.ArrayList;

public class Stack<E> {
    private final ArrayList<E> arrayList = new ArrayList<>();

    public void push(E item) {
        arrayList.add(item);
    }

    public E pop() {
        return arrayList.remove(arrayList.size() - 1);
    }

    public boolean isEmpty() {
        return arrayList.size() == 0;
    }
}

