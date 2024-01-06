package com.Sorting.algo;

public class BubbleSort {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        swapValuesUsingXOROperator(a,b);
    }

    void BubbleAlgo(int[] a) {
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
    private void swap(int i, int j) {
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
