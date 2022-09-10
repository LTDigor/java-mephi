package ru.mephi.java.ch03.sec11;

import java.io.*;

public class PrintFilesFromDir {
    public static void printFilesFromDir(String path) {
        File dir = new File(path);
        String[] fileNames = dir.list((thisDir, fileName) -> new File(thisDir, fileName).isFile());

        assert fileNames != null;
        for (String fileName: fileNames) {
            System.out.println(fileName);
        }
    }
}
