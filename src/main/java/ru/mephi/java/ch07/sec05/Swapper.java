package ru.mephi.java.ch07.sec05;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Swapper {
    public static void swap(List<?> list, int i, int j) {
        if (list instanceof RandomAccess) {
            swapHelperRandomAccess(list, i, j);
            return;
        }

        swapHelperLinked(list, i, j);
    }

    private static <T> void swapHelperLinked(List<T> list, int i, int j) {
        // i <= j
        if (j < i) {
            int t = i;
            i = j;
            j = t;
        }

        ListIterator<T> iterator = list.listIterator();

        //go to i element
        while (iterator.nextIndex() < i)
            iterator.next();
        T tempI = iterator.next();

        //go to j element
        while (iterator.nextIndex() < j)
            iterator.next();
        T tempJ = iterator.next();

        iterator.previous();
        iterator.set(tempI);

        //go to i index from start
        if (i <= j - i) {
            iterator = list.listIterator(i);
            iterator.next();
            iterator.set(tempJ);
            return;
        }

        //go back from j to i
        while (iterator.previousIndex() >= i)
            iterator.previous();

        iterator.set(tempJ);
    }

    // wildcard capture, not like in Collections.swap()
    private static <T> void swapHelperRandomAccess(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
