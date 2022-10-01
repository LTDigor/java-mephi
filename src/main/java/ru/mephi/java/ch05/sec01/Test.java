package ru.mephi.java.ch05.sec01;

import java.io.FileNotFoundException;

public class Test {
    private static final String CORRECT_DATA = "src/main/resources/ch05/sec01/dataCorrect.txt";
    private static final String INCORRECT_DATA = "src/main/resources/ch05/sec01/dataIncorrect.txt";
    private static final String NOT_FOUND_DATA = "src/main/resources/ch05/sec01/234356576uhg.txt";

    public static void main(String[] args) {
        try {
            System.out.println(ReadFromFile.readValues(CORRECT_DATA));
            System.out.println(ReadFromFile.sumOfValues(CORRECT_DATA));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong file data");
            e.printStackTrace();
        }

        //wrong file
        try {
            System.out.println(ReadFromFile.readValues(INCORRECT_DATA));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong file data");
            e.printStackTrace();
        }

        //file not found
        try {
            System.out.println(ReadFromFile.readValues(NOT_FOUND_DATA));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong file data");
            e.printStackTrace();
        }

        //wrong file
        try {
            System.out.println(ReadFromFile.sumOfValues(INCORRECT_DATA));
        } catch (FileNotFoundException e) {
            System.out.println("Cant get sum. File not found");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Cant get sum. Wrong file data");
            e.printStackTrace();
        }

        //file not found
        try {
            System.out.println(ReadFromFile.sumOfValues(NOT_FOUND_DATA));
        } catch (FileNotFoundException e) {
            System.out.println("Cant get sum. File not found");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Cant get sum. Wrong file data");
            e.printStackTrace();
        }

    }
}
