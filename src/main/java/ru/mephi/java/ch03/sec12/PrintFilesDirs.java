package ru.mephi.java.ch03.sec12;

import java.io.File;
import java.util.Arrays;

public class PrintFilesDirs {
    public static void printFilesDirs(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        Arrays.sort(files, (File file1, File file2) -> {
            if (file1.isFile() && file2.isDirectory()) {
                return -1;
            }
            else if (file1.isDirectory() && file2.isFile()) {
                return 1;
            }
            return file1.getAbsolutePath().compareTo(file2.getAbsolutePath());
        });

        for(File file: files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
