package com.multiThreading;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.ExceptionHandler;

//  All about Threads (not concurrency/executorserivce/threadpool)

/* Theads*/
/* LifeCycle
 * 
NEW	: created but not started
RUNNABLE:	Thread ready to run or running
BLOCKED :	Waiting to acquire lock
WAITING :	Waiting indefinitely for another thread (e.g., join())
TIMED_WAITING :	Waiting for a specific time (e.g., sleep(ms))
TERMINATED	:Thread has finished execution
*/

/* Ways
 * Thread class
 * 
 * Runnable interface
*/

// Thread Using Lambda 

//

class RunnableI implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().getName();
    }

}

class ThreadClass extends Thread {
    public void run() {
        System.out.println("Hello ");
    }

    public void method1() {
        System.out.println("Hello Method 1 ");
    }
}

public class MultiThreading4 {

    public static void main(String[] args) {
        callByThreadClass();
        callBYRunnableInterface();
        callByLambda();
        threadMethods();
    }

    private static void callByThreadClass() {
        ThreadClass thr = new ThreadClass();
        thr.start();
    }

    private static void callBYRunnableInterface() {
        RunnableI r = new RunnableI();
        // r.run(); //Can Start by this way also
        Thread thread = new Thread(r);
        thread.start();
    }

    private static void callByLambda() {
        int t = 5;
        // Note Here We are calling Runnable method
        new Thread(() -> simpleMethod1(5)).start();
        // Extended version

        // We cannot pass variable like below, as it implements run method

        // Runnable r = (int p) -> System.out.println("Thread using lambda" + p);
        // Runnable r = (var s) -> System.out.println("Hello " + s);

        Runnable r = () -> System.out.println("Hello ");
        new Thread(r).start();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Yo " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("T2 waiting for T1...");
            try {
                t1.join(); // wait for t1 to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T2 started after T1");
        });

    }

    static void simpleMethod1(int n) {
        System.out.println("Simple Method 1" + n * n);

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Yo " + i);
            }
        });
        t.setDaemon(true);
        t.setPriority(n);
        t.setName("MyThread");
        t.getName();
      //  t.join(); // Main thread will wait for t to finish

    }

    // private static Callable<Integer> simpleMethod(int a) {
    // return new Callable<Integer>() {
    // }; }

    @ExceptionHandler(Exception.class)
    private static void threadMethods()  {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Sleeping for 5 sec");
                Thread.sleep(5000); // Will be interrupted
                System.out.println("Woke up normally");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        });

        t.start();
     //   Thread.sleep(1000);
        // Let thread sleep for 1 sec
        t.interrupt();
    }

}

class MethodDeclare implements Runnable {
    public void run() {

    }
}
// isAlive -> check thread is still running
// sleep ->
// join -> wait for other threads to finish
// yield -> pause to let other thread execute
// priority -> setPriority(1 -10)
// run -> code to execute in thread
// getName -> get the name of thread
// interrupt -> interrupt a sleeping/waiting thread
// currentThread() -> returns current existing thread

// https://www.geeksforgeeks.org/java/synchronization-in-java/

/*
 * // Constructors
 * Thread() // new thread, no task
 * Thread(Runnable target) // takes Runnable task
 * Thread(String name) // thread with name
 * Thread(Runnable target, String name) // task + name
 * 
 * 
 */