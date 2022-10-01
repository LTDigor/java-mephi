package ru.mephi.java.ch05.dop.fileHelper;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Test {
    static String FOLDER_PATH = "src/main/resources/ch05/dop/";
    static String FILE_NAME = "data.txt";
    static String COPIED_NAME = "copied.txt";
    static String MOVED_NAME = "moved.txt";

    public static void main(String[] args) {
        FileHelper fileHelper = new FileHelper();

        //delete files if exists
        try {
            fileHelper.remove(FOLDER_PATH + COPIED_NAME);
        }
        catch (NoSuchFileException e) {
            System.out.println("Cant find file " + COPIED_NAME);
            System.out.println("But its ok!\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileHelper.remove(FOLDER_PATH + "/newFolder/" +  MOVED_NAME);
        }
        catch (NoSuchFileException e) {
            System.out.println("Cant find file " + "/newFolder/" +  MOVED_NAME);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileHelper.copy(FOLDER_PATH + FILE_NAME, FOLDER_PATH + COPIED_NAME);
            fileHelper.move(FOLDER_PATH + COPIED_NAME, FOLDER_PATH + "/newFolder/" +  MOVED_NAME);
            System.out.println("Now you can find the file " + FOLDER_PATH + "/newFolder/" +  MOVED_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
