package ru.mephi.java.ch09.sec01;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sec01 {
    private static final String RESOURCE_PATH = "src/main/resources/ch09/";

    public static void main(String[] args) {
        Path inputPath1 = Paths.get(RESOURCE_PATH, "input1.txt");
        Path outputPath1 = Paths.get(RESOURCE_PATH, "output1.txt");

        try (InputStream in = Files.newInputStream(inputPath1); OutputStream out = Files.newOutputStream(outputPath1)) {
            copy(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path inputPath2 = Paths.get(RESOURCE_PATH, "input2.txt");
        Path outputPath2 = Paths.get(RESOURCE_PATH, "output2.txt");
        try (InputStream in = Files.newInputStream(inputPath2); OutputStream out = Files.newOutputStream(outputPath2)) {
            copyNoLoop(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        final int BLOCKSIZE = 1024;
        byte[] bytes = new byte[BLOCKSIZE];
        int len;

        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
    }

    public static void copyNoLoop(InputStream in, OutputStream out) throws IOException {
        Path tmpPath = Files.createTempFile(null, ".txt");
        Files.write(tmpPath, in.readAllBytes());

        byte[] bytes = Files.readAllBytes(tmpPath);
        out.write(bytes);

        Files.delete(tmpPath);
    }
}
