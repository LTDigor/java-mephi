package ru.mephi.java.ch05.dop.fileHelper;

import java.io.IOException;
import java.util.Scanner;

public class TestConsole {
    private static void printHelp() {
        System.out.println("---With this program you can move, copy and remove files---");
        System.out.println("\t\"move <fileName> <targetFileName>\" for move the file");
        System.out.println("\t\"remove <fileName>\" for delete the file");
        System.out.println("\t\"copy <fileName> <copiedFileName>\" for copy the file");
        System.out.println("\t\"errors\" for print errors in the program");
        System.out.println("\t\"exit\" for close this program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHelper fileHelper = new FileHelper();
        printHelp();
        while(true) {
            String command = scanner.next();
            switch (command){
                case "move":
                    String fileFrom = scanner.next();
                    String fileTo = scanner.next();
                    try {
                        fileHelper.move(fileFrom, fileTo);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "remove":
                    String fileName = scanner.next();
                    try {
                        fileHelper.remove(fileName);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "copy":
                    String fileForCopy = scanner.next();
                    String fileCopied = scanner.next();
                    try {
                        fileHelper.copy(fileForCopy, fileCopied);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "errors":
                    for (Exception e: fileHelper.getExceptions()) {
                        e.printStackTrace();
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Wrong command, try again.");
            }
            if (command.equals("exit"))
                break;
        }
    }
}
