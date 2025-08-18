package com.multiThreading;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// Executor is of util.concurrent package

/*
Executors.newCachedThreadPool()
Executors.newFixedThreadPool
Executors.newCachedThreadPool()
Executors.newFixedThreadPool()

 newFixedThreadPool(n)	    Fixed-size thread pool
newSingleThreadExecutor()	One thread only
newCachedThreadPool()	    Creates threads as needed, reuses idle threads
*/

public class ExecutorSerivce1 {
    public static void main(String[] args) {
        //  ExecutorService ex = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        try  {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            executor.execute(
                    new Runnable() {
                        @Override
                        public void run() {

                            try {
                                Thread.sleep(4000);
                                System.out.println("Hello World");
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });

        } catch (Exception e) {
            System.out.println(e);
        }


        try  {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            executor.submit(
                    new Runnable() {
                        @Override
                        @SneakyThrows  //
                        public void run() {
                            Thread.sleep(4000);
                            System.out.println("Hello World Via Submit");

                        }

                    });

        } catch (Exception e) {
            System.out.println(e);
        }





        ExecutorService executor = Executors.newFixedThreadPool(5);

        executor.execute(new Multithreading2(1, "Sachin"));
        executor.execute(new Multithreading2(2, "Yadav"));

        executor.shutdown();

    }


}
