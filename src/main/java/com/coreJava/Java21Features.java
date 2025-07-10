package com.coreJava;

import lombok.Data;
import org.springframework.web.client.RestClient;

import java.net.http.HttpClient;
import java.time.Duration;
import java.util.concurrent.Executors;

record Points(int x, int y) {
}

record Details(int x, int y) {
}

@Data
class NewClass {
    String name;
}

// Virtual Threads
// Normal thread in java are managed by OS level.
//  Virtual thread are manged by JVM
/*
Virtual threads are lightweight threads managed by the  (JVM) rather than by the operating system.
 It allow u to create millions of concurrent threads with less memory & resource used compared to traditional platform (OS) threads.
* */


public class Java21Features {


    public static void main(String[] args) throws InterruptedException {
        String name = "Sachin";
        //Preview
//     String fullName = StringTemplate.STR." Hello {name} Yadav";


        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 100_000; i++) {
                executor.submit(() -> {
                    // some blocking or I/O operation
                });
            }
        }


        staticMethod1();
        Points ps = new Points(10, 20);
        staticMethod2(ps);
        staticMethod3(ps);
        staticMethod4(ps);
        restClientMethod();
    }


    // Latest Switch
    private static String staticMethod4(Object obj) {
        return switch (obj) {
            case Points p -> "Points " + p.x();
            case Details d -> "Details " + d.x();
            case NewClass nc -> "NewClass " + nc.name;
            default -> "Default ";
        };
    }


    private static int staticMethod2(Object obj) {
        int sum = 0;
        if (obj instanceof Points p) {
            int a = p.x();
            int b = p.y();
            sum = a + b;
        }
        return sum;
    }

    // Latest Record Pattern
    private static int staticMethod3(Object obj) {
        if (obj instanceof Points(int x, int y)) {
            return x + y;
        }
        return 0;
    }


    private static void staticMethod1() throws InterruptedException {
//        boolean isEmojiChar = Character.isEmoji('????');
        boolean canHaveModifier = Character.isEmojiModifierBase('✋');
        HttpClient client = HttpClient.newHttpClient();
        client.shutdown();
        if (client.awaitTermination(Duration.ofMinutes(1))) {
            System.out.println("Client terminated successfully.");
        } else {
            System.out.println("Client termination took longer than expected.");
        }

    }


    private static void restClientMethod() {
        HttpClient client = HttpClient.newHttpClient();
        RestClient rc = RestClient.create();
        NewClass responseBody = rc.get()
                .uri("https://www.google.com/")
                .retrieve()
                .body(NewClass.class);
        
    }

}
