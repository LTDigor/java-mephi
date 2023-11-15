package ru.mephi.java.ch09.sec04;

import ru.mephi.java.ch09.utils.TimestampPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class CompareScannerBufferReader {
    private static final String RESOURCE_PATH = "src/main/resources/ch09/sec04";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(RESOURCE_PATH, "WarAndPiece.txt");
        Scanner sc = new Scanner(path);

        TimestampPrinter.INSTANCE.getTime(() -> {
            while (sc.hasNextLine()) {
                sc.nextLine();
            }
            return null;
        });

        try (BufferedReader bufferReader = Files.newBufferedReader(path)) {
            TimestampPrinter.INSTANCE.getTime(() -> {
                while (true) {
                    try {
                        if (Objects.equals(bufferReader.readLine(), null)) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return null;
            });
        }

        TimestampPrinter.INSTANCE.getTime(() -> {
            try {
                Files.newBufferedReader(path).lines().count();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
    }
}
