package ru.mephi.java.ch09.sec11;

import java.util.Arrays;

public class DirPathNames {
    public static void main(String[] args) {
        String path = "/home/cay/myfile.txt";
        System.out.println(Arrays.toString(getNames(path)));
    }

    public static String[] getNames(String path) {
        return  path.substring(1).split("[/.]+");
    }
}

