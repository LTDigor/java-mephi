package ru.mephi.java.ch06.sec06;

import java.util.ArrayList;

public class Appender {
    public static <E> void appendExtends(
            ArrayList<E> arr1,
            ArrayList<? extends E> src
    ){
        arr1.addAll(src);
    }

    public static <E> void appendSuper(
            ArrayList<? super E> arr1,
            ArrayList<E> src
    ){
        arr1.addAll(src);
    }


}
