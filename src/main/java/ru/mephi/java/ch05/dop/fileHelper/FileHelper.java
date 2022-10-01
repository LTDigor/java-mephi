package ru.mephi.java.ch05.dop.fileHelper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileHelper {
    private final ArrayList<Exception> exceptions = new ArrayList<>();

    public void copy(String originalName, String copiedName) throws IOException {
        try {
            Files.copy(Path.of(originalName), Path.of(copiedName));
        }
        catch (IOException e) {
            exceptions.add(e);
            throw e;
        }
    }

    public void move(String fileName, String targetName) throws IOException {
        try {
            Files.move(Path.of(fileName), Path.of(targetName));
        }
        catch (IOException e) {
            exceptions.add(e);
            throw e;
        }
    }

    public void remove(String fileName) throws IOException {
            try {
                File file = new File(fileName);
                Files.delete(file.toPath());
            }
            catch (IOException e) {
                exceptions.add(e);
                throw e;
            }
    }

    public ArrayList<Exception> getExceptions() {
        return exceptions;
    }
}
