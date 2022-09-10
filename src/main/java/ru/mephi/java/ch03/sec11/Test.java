package ru.mephi.java.ch03.sec11;

import static ru.mephi.java.ch03.sec11.PrintFilesFromDir.printFilesFromDir;

public class Test {
    public static void main(String[] args) {
        String absolutePath = "D:\\Files\\GPSS_MODELS";

        printFilesFromDir(absolutePath);
    }
}
