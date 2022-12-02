package ru.mephi.java.ch07.sec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestReadWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/ch07/sec07/data.txt");
        Scanner scanner = new Scanner(file);

        Map<String, Integer> map = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }

        for (String key: map.keySet()) {
            System.out.println("Word: " + key + " Counter: " + map.get(key));
        }
    }
}
