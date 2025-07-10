package com.dsa.algo;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int a[] = CollectionUtils.getIntArray();

        System.out.println(Arrays.toString(a));
        // swapValuesUsingXOROperator(a,b);
    }

    static void swapValuesUsingXOROperator(int m, int n) {
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("Value : " + m + " and " + n);
    }

}
