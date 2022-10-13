package ru.mephi.java.ch06.sec02;

import java.lang.reflect.Array;

public class StackArrGen<E> {
    private static final int START_LEN = 2;

    private E[] arr;
    private int indexLast = -1;

    public StackArrGen(Class<E> cl) {
        @SuppressWarnings("unchecked")
        E[] newArr = (E[]) Array.newInstance(cl, START_LEN);
        arr = newArr;
    }

    public E pop() {
        return arr[indexLast--];
    }

    public boolean isEmpty() {
        return indexLast < 0;
    }

    public void push(E item) {
        //add memory
        if (indexLast >= arr.length - 1) {
            @SuppressWarnings("unchecked")
            E[] newArr = (E[]) Array.newInstance(item.getClass(), arr.length * 2);

            if (indexLast + 1 >= 0) {
                System.arraycopy(arr, 0, newArr, 0, indexLast + 1);
            }

            arr = newArr;
        }

        arr[++indexLast] = item;
    }
}
