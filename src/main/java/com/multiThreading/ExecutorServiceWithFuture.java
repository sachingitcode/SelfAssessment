package com.multiThreading;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

class Test implements Runnable {
    int counter = 0;

    public Test() {
    }

    public Test(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter++;
        System.out.println("Counter value is " + counter);
    }
}


class ExecutorServiceImpl {
    int count = 0;
    int start = 0;

    public void executorServ() {
        try (ExecutorService executor = newSingleThreadExecutor()) {
            var r = executor.submit(() -> {
            });  // Both working are same , It returns Future
            executor.execute(() -> {
            });       // Both working are same , It returns Nothing

            //   executor.execute(method1()); // here it need Runnable OR Callable type not normal method return type
            executor.execute(new Test());  // Here It requires runnable , Test had Runnable interface

            /* Another Way to write */
            executor.execute(new Runnable() {
                @Override
                public void run() {
                }
            });

            executor.execute(new Test(13));
            System.out.println("# ");

            /* Another Way to write. This is good for US  */
            executor.execute(() -> {
                count++;
                System.out.println("<>-<>" + Thread.currentThread().getName() + ": " + count);
                var t = method1();
                System.out.println("|^^|" + t);
            });

            for (int i = 0; i < 5; i++) {
                //   executor.execute(new Test());
            }

            /* WORK WITH FUTURE */
            Future<String> future = executor.submit(() -> "Result from task");
            String result = future.get();
            System.out.println("Check the result :" + result);

            Future<String> future1 = executor.submit(() -> {
                Thread.sleep(5000);
                return "Result from task";
            });
            String result1 = future1.get(3000, TimeUnit.MILLISECONDS);
            System.out.println("Check the New result :" + result1);

            /*As Future . get() didn't get the response in specific time period,so it gives TimeoutException    */

            executor.shutdown();
            //  executor.shutdownNow();

        } catch (TimeoutException e) {
            System.err.println("It gives the Timeout " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public String method1() {
        return "String Method Yo Yo Yo ";
    }
}


public class ExecutorServiceWithFuture {

    public static void main(String[] args) {
        ExecutorServiceImpl e = new ExecutorServiceImpl();
        e.executorServ();
    }

}
