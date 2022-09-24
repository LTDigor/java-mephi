package ru.mephi.java.ch05.sec08;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/ch05/sec01/dataCorrect.txt");

        ReentrantLock lock = new ReentrantLock();
        try (BufferedReader in3 = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            lock.lock();
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }


    }
}
