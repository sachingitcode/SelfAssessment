package com.dsa.algo;

import java.util.Arrays;

public class FibonacciByDynamicProgram {
    static int p = 0;
    static int j = 0;

    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1};
        var a = fibonacci(7, arr);
        System.out.println("" + a);
        System.out.println(":::" + Arrays.toString(arr));
    }

    private static int fibonacci(int n, int[] arr) {
        System.out.println("Getting for N:" + n + " ^^^ " + j++);
        if (arr[n] == -1) {
            if (n <= 1)
                return n;
            var t = fibonacci(n - 2, arr) + fibonacci(n - 1, arr);
            arr[n] = t;
            return t;
        } else
            return arr[n];
    }

}
