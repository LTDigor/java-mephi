package ru.mephi.java.ch03.sec13;

public class RunAll {
    public static Runnable runAllInOrder(Runnable... tasks) {
        Runnable task = () -> {
            for (int i = 0; i < tasks.length; i++) tasks[i].run();
        };

        return task;
    }
}
