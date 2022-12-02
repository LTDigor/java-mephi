package ru.mephi.java.ch07.sec18;

import java.util.Collections;
import java.util.Map;

public class TestCollectionsEmpty {
    public static void main(String[] args) {
        // raw type
        @SuppressWarnings("unchecked")
        Map<String, String> emptyMap1 = (Map<String, String>) Collections.EMPTY_MAP;

        // EMPTY_MAP inside
        Map<String, String> emptyMap2 = Collections.emptyMap();

    }
}
