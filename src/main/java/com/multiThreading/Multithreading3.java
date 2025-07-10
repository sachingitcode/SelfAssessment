package com.multiThreading;

public class Multithreading3 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        System.out.println("Method 1 started");
        new Thread(() -> method2()).start();
    }

    private static void method2() {
        System.out.println("Method 2 started");
    }

}
