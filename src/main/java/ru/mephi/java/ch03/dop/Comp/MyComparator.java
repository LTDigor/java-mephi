package ru.mephi.java.ch03.dop.Comp;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

@FunctionalInterface
public interface MyComparator extends Comparator<String> {

    int compare(String o1, String o2);

    default MyComparator reversed() {
        return (o2, o1) -> this.compare(o1, o2);
    }

    default MyComparator thenComparing(MyComparator other) {
        return (o1, o2) -> {
            if (this.compare(o1, o2) != 0) return this.compare(o1, o2);
            else return other.compare(o1, o2);
        };
    }

    default <U extends Comparable<? super U>> MyComparator thenComparing(Function<? super String, ? extends U> keyExtractor) {
        return (o1, o2) -> {
            if (this.compare(o1, o2) != 0) return this.compare(o1, o2);
            else return keyExtractor.apply(o1).compareTo(keyExtractor.apply(o2));
        };
    }

    default MyComparator thenComparing(Function<? super String, String> keyExtractor, MyComparator other) {
        return (o1, o2) -> {
            if (this.compare(o1, o2) != 0) return this.compare(o1, o2);
            else return other.compare(keyExtractor.apply(o1), keyExtractor.apply(o2));
        };
    }

    public static MyComparator comparingDouble(ToDoubleFunction<? super String> keyExtractor) {
        return (o1, o2) -> Double.compare(keyExtractor.applyAsDouble(o1), keyExtractor.applyAsDouble(o2));
    }

    default MyComparator thenComparingDouble(ToDoubleFunction<? super String> keyExtractor) {
        return thenComparing(comparingDouble(keyExtractor));
    }

    public static MyComparator comparingInt(ToIntFunction<? super String> keyExtractor) {
        return (o1, o2) -> Integer.compare(keyExtractor.applyAsInt(o1), keyExtractor.applyAsInt(o2));
    }

    default MyComparator thenComparingInt(ToIntFunction<? super String> keyExtractor) {
        return thenComparing(comparingInt(keyExtractor));
    }

    public static MyComparator comparingLong(ToLongFunction<? super String> keyExtractor) {
        return (o1, o2) -> Long.compare(keyExtractor.applyAsLong(o1), keyExtractor.applyAsLong(o2));
    }

    default MyComparator thenComparingLong(ToLongFunction<? super String> keyExtractor) {
        return thenComparing(comparingLong(keyExtractor));
    }

    static MyComparator nullsFirst(MyComparator other) {
        return (o1, o2) -> {
            if (o1 != null && o2 != null) return other.compare(o1, o2);
            else if (o1 == null) return -1;
            else return 1;
        };
    }

    static MyComparator nullsLast(MyComparator other) {
        return (o1, o2) -> {
            if (o1 != null && o2 != null) return other.compare(o1, o2);
            else if (o1 == null) return 1;
            else return -1;
        };
    }

    static MyComparator naturalOrder() {
        return String::compareTo;
    }

    static MyComparator comparing(Function<? super String, String> keyExtractor) {
        return (o1, o2) -> keyExtractor.apply(o1).compareTo(keyExtractor.apply(o2));
    }

    static MyComparator comparing(Function<? super String, String> keyExtractor, MyComparator other) {
        return (o1, o2) -> other.compare(keyExtractor.apply(o1), keyExtractor.apply(o2));
    }

    static MyComparator reverseOrder() {
        return naturalOrder().reversed();
    }

}
