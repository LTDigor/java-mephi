package ru.mephi.java.ch07.sec16;

import java.util.*;
import java.util.function.IntFunction;

public class GetListCache {
    // from task 13, or use anon class
    private static class Cache<K, V> extends LinkedHashMap<K, V> {
        private final int capacity;

        Cache(int capacity) {
            super();
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    public static <R> List<R> getIntegerList(IntFunction<R> function, int cacheSize) {
        return Collections.unmodifiableList(
                new AbstractList<>() {
                    private final Cache<Integer, R> cache = new Cache<>(cacheSize);

                    @Override
                    public R get(int index) {
                        // get value from cache
                        if (cache.containsKey(index)) {
                            return cache.get(index);
                        }

                        // compute result
                        R res = function.apply(index);
                        cache.put(index, res);
                        return res;
                    }

                    @Override
                    public int size() {
                        throw new UnsupportedOperationException();
                    }
                }
        );
    }
}
