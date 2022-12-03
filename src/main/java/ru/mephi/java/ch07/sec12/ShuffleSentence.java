package ru.mephi.java.ch07.sec12;

import java.util.*;

public class ShuffleSentence {
    public static String shuffleSentence(String str) {
        // remove first letter upper case
        String strFormatted = str.strip();
        strFormatted = strFormatted.substring(0, 1).toLowerCase() + strFormatted.substring(1);

        // remove last point
        if (strFormatted.charAt(strFormatted.length() - 1) == '.' && strFormatted.length() > 1) {
            strFormatted = strFormatted.substring(0, strFormatted.length() - 1);
        }

        List<String> shuffled = new ArrayList<>(Arrays.asList(strFormatted.split("\\s+")));
        Collections.shuffle(shuffled);

        // add upper case to first letter and point in the end
        String res = String.join(" ", shuffled) + ".";
        res = res.substring(0, 1).toUpperCase() + res.substring(1);

        return res;
    }
}
