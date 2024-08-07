package com.dsa.algo;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int a[] = CollectionUtils.getIntArray();
        BubbleAlgo( a);
        System.out.println(Arrays.toString(a));
     //   swapValuesUsingXOROperator(a,b);
    }

   static void BubbleAlgo(int[] a) {
        var n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    swap(a[j], a[j + 1]);
                }
            }
        }
    }

    // Collections.swap(list, 0, 4);
    private static void swap(int i, int j) {
        var t = i;
        i = j;
        j = t;
    }

    static void swapValuesUsingXOROperator(int m, int n) {
        m = m ^ n; 
        n = m ^ n;
        m = m ^ n;
        System.out.println("Value : " + m+ " and " + n);

    }

}
