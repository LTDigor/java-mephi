package ru.mephi.java.ch03.sec10;

import java.io.*;

public class AllDirs {

    public static void printSubdirsLambda(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles(file-> file.isDirectory());

        for(File file: files) {
            System.out.println(file.getAbsolutePath());
            printSubdirsLambda(file.getAbsolutePath());
        }
    }

    public static void printSubdirsMethodLink(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles(File::isDirectory);

        for(File file: files) {
            System.out.println(file.getAbsolutePath());
            printSubdirsMethodLink(file.getAbsolutePath());
        }
    }

    public static void printSubdirsAnonClass(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        for(File file: files) {
            System.out.println(file.getAbsolutePath());
            printSubdirsAnonClass(file.getAbsolutePath());
        }
    }
}
