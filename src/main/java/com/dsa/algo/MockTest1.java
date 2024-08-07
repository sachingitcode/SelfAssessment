package com.dsa.algo;
//  Product of Array Except for Self 

public class MockTest1 {
    public static void main(String[] args) {
        int[] a = {6, 1, 9, 5, 2, 3, 7, 4};
        merger(a, 0, 7);
    }

    private static void merger(int[] a, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            merger(a, l, mid);
            merger(a, mid + 1, h);
            twoWayMerge(a, l, mid, h);
            System.out.println("***" + a[l] + "----" + a[h] + "");
        }
    }

    private static void twoWayMerge(int[] a, int beg, int mid, int end) {





    }
}



























