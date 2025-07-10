package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSerivce2 {
    public static void main(String[] args) {
        ExecutorService exe_service = Executors.newCachedThreadPool();
        exe_service.execute(() -> System.out.println("Hello World!"));
        exe_service.execute(() -> newMethod1());

        exe_service.shutdown();
    }

    private static void newMethod1() {
    }
}
