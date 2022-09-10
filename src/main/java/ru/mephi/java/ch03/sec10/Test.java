package ru.mephi.java.ch03.sec10;

import static ru.mephi.java.ch03.sec10.AllDirs.printSubdirsLambda;

public class Test {
    public static void main(String[] args) {
        String absolutePath = "D:\\Files";
        printSubdirsLambda(absolutePath);
    }
}
