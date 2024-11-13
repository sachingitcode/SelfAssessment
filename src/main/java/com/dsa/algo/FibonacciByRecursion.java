package com.dsa.algo;

import java.util.Arrays;

public class FibonacciByRecursion {
    static int p = 0;
    static int j = 0;

    public static void main(String[] args) {

        fibonacci1(7);

//        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1};
//        var a = fibonacci(7, arr);

    }

    private static int fibonacci1(int n) {
        System.out.println("Getting for N:" + n + " ^ " + p++);
        if (n <= 1)
            return n;
        return fibonacci1(n - 2) + fibonacci1(n - 1);
    }


//    private static int fibonacci(int n, int[] arr) {
//        System.out.println("Getting for N:" + n + " ^^^ " + j++);
//        if (arr[n] == -1) {
//            if (n <= 1)
//                return n;
//            var t = fibonacci(n - 2, arr) + fibonacci(n - 1, arr);
//            arr[n] = t;
//            return t;
//        } else
//            return arr[n];
//    }

}
