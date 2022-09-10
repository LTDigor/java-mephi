package ru.mephi.java.ch02.sec11;

import java.time.LocalDate;

import static java.lang.System.out;
import static java.time.LocalDate.of;

public class Cal {
    private static final String[] weekDays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void show(int year, int month) {
        int startDay = 1;
        LocalDate date = of(year, month, 1);

        //print days of week
        for (int i = 0; i < weekDays.length; i++) {
            out.print(" " + weekDays[(i + startDay - 1) % weekDays.length]);
        }
        out.println();

        //shift for the first day
        int spaceNumber = (weekDays.length + date.getDayOfWeek().getValue() - startDay) % weekDays.length;
        for (int i = 0; i < spaceNumber; i++) {
            out.print("    ");
        }

        //print days
        while (date.getMonthValue() == month) {
            out .printf ("%4d", date.getDayOfMonth()) ;
            if ((date.getDayOfWeek().getValue() + spaceNumber - 1) % weekDays.length == 0) {
                out.println();
            }
            date = date.plusDays(1);
        }

        if ((date.getDayOfWeek().getValue() + spaceNumber - 2) % weekDays.length != 0) {
            out.println();
        }
    }

}
