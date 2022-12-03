package ru.mephi.java.ch07.sec08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/ch07/sec08/data.txt");
        Set<String> words = ReadAllWords.wordsFromFile(file);

        System.out.println("Words set: " + words);

        Scanner scanner = new Scanner(file);
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if(ReadAllWords.lineToSet(line).equals(words)) {
                System.out.println(lineNumber + ": " + line);
            }

            lineNumber++;
        }
    }
}
