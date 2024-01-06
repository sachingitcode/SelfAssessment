package com.advanceJava;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 11, 4, 1, 16 , 5 ,1};
        int tmp = 0;
        System.out.println("Sorting with Selection  Sort");
        //Time Complexity: O(n2) as there are two nested loops.

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1 ; j < a.length; j++) {
                System.out.println("Before Sorting "  + a[i] + " "+ a[j] + " " +  Arrays.toString(a));
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                System.out.println("After Sorting " + Arrays.toString(a));
            }
            System.out.println("After !!!!!  Sorting " +  Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}


