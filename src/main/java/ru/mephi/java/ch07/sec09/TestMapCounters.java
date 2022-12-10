package ru.mephi.java.ch07.sec09;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestMapCounters {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            // update counter with merge
            map.merge("wordMerge", 1, Integer::sum);

            // update counter with contains
            map.put("wordContains", 1 + (map.containsKey("wordContains") ? map.get("wordGet") : 0));

            // update counter with get
            if (map.get("wordGet") != null) {
                map.put("wordGet", map.get("wordGet") + 1);
            } else {
                map.put("wordGet", 1);
            }

            // update counter with getOrDefault
            map.put("wordGetOrDefault", 1 + map.getOrDefault("wordGetOrDefault", 0));

            // update counter with putIfAbsent
            map.putIfAbsent("wordPutIfAbsent", 0);
            map.put("wordPutIfAbsent", map.get("wordPutIfAbsent") + 1);
        }

        System.out.println(map);
    }
}
