package ru.mephi.java.ch05.sec06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/ch05/sec01/dataCorrect.txt");

        //try-finally with try-catch
        BufferedReader in1 = null;
        try {
            in1 = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in1 != null) {
                try {
                    in1.close(); // Caution—might throw an exception
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //trt-finally in try-catch
        BufferedReader in2 = null;
        try {
            try {
                in2 = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.err.println("Caught IOException: " + ex.getMessage());
            } finally {
                if (in2 != null) {
                    in2.close(); // Caution—might throw an exception
                }
            }
        }
        catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());

        }

        //try with resources
        try (BufferedReader in3 = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            System.out.println("in3 stream is created");
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }

    }
}
