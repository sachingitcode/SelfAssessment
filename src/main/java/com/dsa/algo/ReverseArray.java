package com.dsa.algo;

public class ReverseArray {

    public static void main(String... args) {

        String[] a = { "A", "B", "C", "D", "E" };
        int n = a.length - 1;

        String tmp;
        for (int i = 0; i <= n / 2; i++) {
            tmp = a[i];
            a[i] = a[n - i];
            a[n - i] = tmp;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(a[i]);
        }
    }
}
