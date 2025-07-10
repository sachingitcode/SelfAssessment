package com.multiThreading;

public class Multithreading2 implements Runnable {
    int counter = 0;
    String name;

    public Multithreading2() {
    }

    public Multithreading2(int counter, String name) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Multithreading2 thread started for + " + counter + ":" + name);
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new Multithreading2(0, "test"));
        thread.start();

        Thread thread1 = new Thread(new Multithreading2(1, "test_1"));
        thread1.start();
    }
}
