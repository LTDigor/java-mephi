package ru.mephi.java.ch05.sec05;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    private static final String INPUT_FILENAME = "src/main/resources/ch05/sec05/input.txt";
    private static final String OUTPUT_FILENAME = "src/main/resources/ch05/sec05/output.txt";

    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;

        try {
            in = new Scanner(Paths.get(INPUT_FILENAME));
            out = new PrintWriter(OUTPUT_FILENAME);

            out.println(in.nextInt());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            //do smth
            System.out.println("IOException");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            //do smth else
            System.out.println("Wrong input data");
            e.printStackTrace();
        }
        finally {
            closeMyStream(in);
            closeMyStream(out);
        }
    }

    public static void closeMyStream(Closeable stream) {
        if (stream == null)
            return;

        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
