package ru.mephi.java.ch05.sec08;

import java.util.concurrent.locks.ReentrantLock;

public class MyLockedClass {
    public static ReentrantLock reentrantLock = new ReentrantLock();

    public static AutoCloseable lock() {
        reentrantLock.lock();

        return new AutoCloseable() {
            @Override
            public void close() {
                try {
                    if (reentrantLock.isLocked())
                        reentrantLock.unlock();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
