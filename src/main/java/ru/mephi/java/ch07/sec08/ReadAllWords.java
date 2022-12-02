package ru.mephi.java.ch07.sec08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ReadAllWords {
    public static Set<String> wordsFromFile(File file) throws FileNotFoundException {
        Set<String> res = new HashSet<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            res.add(scanner.next());
        }

        return res;
    }

    public static Set<String> lineToSet(String line) {
        //any spaces number
        String[] words = line.split("\\s+");
        return new HashSet<String>(List.of(words));
    }
}
