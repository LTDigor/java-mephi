package ru.mephi.java.ch06.sec02;

public class StackArrObj<E> {
    private static final int START_LEN = 2;

    private Object[] arr = new Object[START_LEN];
    private int indexLast = -1;

    public E pop() {
        @SuppressWarnings("unchecked")
        E res = (E) arr[indexLast--];
        return res;
    }

    public boolean isEmpty() {
        return indexLast < 0;
    }

    public void push(E item) {
        //add memory
        if (indexLast >= arr.length - 1) {
            Object[] newArr = new Object[arr.length * 2];

            if (indexLast + 1 >= 0) {
                System.arraycopy(arr, 0, newArr, 0, indexLast + 1);
            }
            arr = newArr;
        }

        arr[++indexLast] = item;
    }
}
