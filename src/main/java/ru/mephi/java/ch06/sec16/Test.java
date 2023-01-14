package ru.mephi.java.ch06.sec16;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Method sortMethod = Test.class.getMethod("sort", List.class);
        Method maxMethod = Test.class.getMethod("max", Collection.class);

        System.out.println(sortMethod + ": " + sortMethod.getParameters()[0].getType());
        System.out.println(maxMethod + ": " + maxMethod.getReturnType()); // return type is Object!
    }

    // sort: T -> Comparable
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
    }

    // helper method with the same signature, type param is T
    // we cant get T type from sort method
    public static <T extends Comparable<? super T>> void sortHelper(T list) {
    }

    // max: T -> Object
    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        return coll.iterator().next();
    }

}
