package com.coreJava;

import java.util.function.BiFunction;
import java.util.function.Function;

interface aInterface {
    void method();
}

interface bInterface {
    void method();
}

interface cInterface {
    int method();
}


//We can Create our default Functions like that BiFunction

@FunctionalInterface
interface TriFunction<A, B, C, D> {
    D reply(A a, B b, C c);
}

public class SimpleInterface3 {
    BiFunction<String, String, Integer> biF = (str1, str2) -> (str1 + str2).length();

    static TriFunction<String, String, String, Integer> triF = (str1, str2, str3) -> (str1 + str2 + str3).length();

    public static void main(String[] args) {
        int as = triF.reply("MY", "NAME", "SACHIN");
        System.out.println(as);
    }

}
class LoggingFunction implements Function<String, String> {
    public String apply(String s) {
        System.out.println("Input: " + s);
        return s.toUpperCase();
    }
    //  OR
    // Function<String, String> fn = (str) -> str.toUpperCase();

}