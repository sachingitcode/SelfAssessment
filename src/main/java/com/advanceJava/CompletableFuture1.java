package com.advanceJava;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture1 {
    public static void main(String[] args) {

        // supplyAsync Takes supplier means it return something
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(8000);
            } catch (Exception e) {
            }
            System.out.println("Executed task");
            return "Hello World";
        });
    }
}
