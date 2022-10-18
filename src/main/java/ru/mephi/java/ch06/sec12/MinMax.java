package ru.mephi.java.ch06.sec12;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> void minmax(
            List<T> elements,
            Comparator<? super T> comp,
            List<? super T> result
    ){
        T min = elements.get(0);
        T max = elements.get(0);

        for(T element: elements) {
            if (comp.compare(max, element) > 0) {
                max = element;
            }

            if (comp.compare(min, element) < 0) {
                min = element;
            }
        }

        result.clear();
        result.add(min);
        result.add(max);
    }

    public static <T> void maxmin(
            List<T> elements,
            Comparator<? super T> comp,
            List<? super T> result
    ) {
        minmax(elements, comp, result);
        // cant swap here, use helper
        // T temp = (T) result.get(0);
        // result.set(0, result.get(1)); - ERROR!
        swapHelper(result, 0, 1);

    }

    private static <T> void swapHelper(List<T> result, int firstInd, int secondInd) {
        T temp = result.get(firstInd);
        result.set(firstInd, result.get(secondInd));
        result.set(secondInd, temp);
    }
}
