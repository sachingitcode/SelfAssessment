package com.coreJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java21VirtualThread {
    static int counter = 0;   // Note we cannot have counter in main  or any method

    public static void main(String[] args) {
        normalThradByRunnable();
        normalThradByThreadClass();
        virtualTHreadByRunnable();
        virtualThreadByExecutor();
    }

    private static void normalThradByRunnable() {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello World " + counter++);
            }
        };//  Thread t1 = new Thread(r);  t1.start();
        new Thread(r).start();
    }

    private static void normalThradByThreadClass() {
    }

    private static void virtualThreadByExecutor() {
        Runnable r = () -> System.out.println("Hello World By VirtualThread");
        Thread.ofVirtual().start(r);  // Note here we are not using new and Thread(r) . we are providing  r to start()

    }

    private static void virtualTHreadByRunnable() {
        Executors.newFixedThreadPool(2).execute(() -> {});
        Executors.newCachedThreadPool().execute(() -> {});



        try (ExecutorService es = Executors.newVirtualThreadPerTaskExecutor();) {
            for (int i = 0; i < 10; i++) {
                es.submit(() -> {
                    System.out.println("Hello World " + counter++);
                });
            }
        }
    }

}


/// Executors
// newFixed