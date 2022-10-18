package ru.mephi.java.ch06.sec14;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/resources/ch05/sec01/dataCorrect.txt");
        ArrayList<AutoCloseable> elems = new ArrayList<>(
                Arrays.asList(Files.newBufferedReader(path, StandardCharsets.UTF_8),
                        Files.newBufferedReader(path, StandardCharsets.UTF_8))
        );

        Closer.closeAll(elems);
    }
}
