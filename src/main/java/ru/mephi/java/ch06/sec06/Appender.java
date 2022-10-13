package ru.mephi.java.ch06.sec06;

import java.util.ArrayList;

public class Appender {
    public static <E> void appendExtends(
            ArrayList<E> arr1,
            ArrayList<? extends E> arr2
    ){
        arr1.addAll(arr2);
    }

    public static <E> void appendSuper(
            ArrayList<? super E> arr1,
            ArrayList<E> arr2
    ){
        arr1.addAll(arr2);
    }


}
