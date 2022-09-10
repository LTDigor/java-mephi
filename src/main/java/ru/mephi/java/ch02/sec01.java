package ru.mephi.java.ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class sec01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            cal(2022, 3, i);
            System.out.println();
        }
    }

    public static void cal(int year, int month, int startDay) {
        LocalDate date = LocalDate.of(year, month, 1);
        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        //print days of week
        for (int i = 0; i < weekDays.length; i++) {
            System.out.print(" " + weekDays[(i + startDay - 1) % weekDays.length]);
        }
        System.out.println();

        //shift for the first day
        int spaceNumber = (weekDays.length + date.getDayOfWeek().getValue() - startDay) % weekDays.length;
        for (int i = 0; i < spaceNumber; i++) {
            System.out.print("    ");
        }

        //print days
        while (date.getMonthValue() == month) {
            System.out .printf ("%4d", date.getDayOfMonth()) ;
            if ((date.getDayOfWeek().getValue() + spaceNumber - 1) % weekDays.length == 0) {
                System.out.println();
            }
            date = date.plusDays(1);
        }

        if ((date.getDayOfWeek().getValue() + spaceNumber - 2) % weekDays.length != 0) {
            System.out.println();
        }
    }
}
