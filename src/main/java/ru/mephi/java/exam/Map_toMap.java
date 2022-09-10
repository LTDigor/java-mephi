package ru.mephi.java.exam;

import java.util.*;
import java.util.function.Function;

public class Map_toMap {
    public static <K, V> Map<K, V> toMap(ArrayList<K> list, Function<K, K> keyExtractor, Function<K, V> valueMapper) {
        Map<K, V> resultMap = new HashMap<>();
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            K item = (K) iterator.next();
            resultMap.put(keyExtractor.apply(item), valueMapper.apply(item));
        }

        return resultMap;
    }
}
