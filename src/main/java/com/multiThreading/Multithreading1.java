package com.multiThreading;

/*threads use a shared memory area.
 They don't allocate separate memory area so saves memory,
 *  context-switching between the threads takes less time than process (Multi-Processing).
 */

//Achieved by 2 ways
// extending Thread Class
// Runnable Interface
// Thread and Runnable are of lang package

public class Multithreading1 extends Thread {
    @Override
    public void run() {
        System.out.println("Multithreading1");
    }

    public static void main(String[] args) {
        Multithreading1 m = new Multithreading1();
        m.start();
        //
        new Multithreading1().start();
    }

}
