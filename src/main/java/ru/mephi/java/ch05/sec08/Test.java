package ru.mephi.java.ch05.sec08;

public class Test {
    public static void main(String[] args) {
//        //with lock
//        Runnable task = (() -> {
//            try(AutoCloseable ignored = MyLockedClass.lock()) {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(i);
//                }
//                System.out.println("Done!\n");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//
//        t1.start();
//        t2.start();

        //without lock
        Runnable taskWithoutLock = (() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
            System.out.println("Done!\n");
        });

        Thread t1NoLock = new Thread(taskWithoutLock);
        Thread t2NoLock = new Thread(taskWithoutLock);

        t1NoLock.start();
        t2NoLock.start();
    }
}
