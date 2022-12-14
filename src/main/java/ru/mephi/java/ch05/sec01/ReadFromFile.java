package ru.mephi.java.ch05.sec01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException, NumberFormatException {
        ArrayList<Double> result = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            result.add(Double.parseDouble(scanner.next()));
        }

        return result;
    }

    public static double sumOfValues(String filename) throws FileNotFoundException, NumberFormatException {
        ArrayList<Double> doubleArrayList;
        try {
            doubleArrayList = readValues(filename);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException("File doesn't found", e);
        }
        catch (NumberFormatException e) {
            throw new RuntimeException("Wrong data format", e);
        }
        double res = 0.0;

        for (double val: doubleArrayList)
            res += val;

        return res;
    }
}
