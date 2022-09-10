package ru.mephi.java.ch03.sec09;

import java.util.Timer;

import static ru.mephi.java.ch03.sec09.Runner.runInOrder;
import static ru.mephi.java.ch03.sec09.Runner.runTogether;

public class Test {
    public static void main(String[] args) {
        final int TASKS_NUMBER = 10;
        Runnable[] tasks = new Runnable[TASKS_NUMBER];
        for (int i = 0; i < TASKS_NUMBER; i++) {
            int finalI = i;
            tasks[i] = () -> System.out.println(finalI + "HelloWorld!");
        }

        runTogether(tasks);
        runInOrder(tasks);
    }
}
