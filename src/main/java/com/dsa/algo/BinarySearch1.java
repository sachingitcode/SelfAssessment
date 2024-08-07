package com.dsa.algo;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;

/* Time taken :  min 1 ; max log n */

public class BinarySearch1 {
    public static void main(String[] args) {
        int a[] = CollectionUtils.getIntArray();
        Arrays.sort(a);
        System.err.println("63 at Position : " + BinSearch(a, a.length, 63));
    }

    private static int BinSearch(int[] a, int length, int key) {
        int l = 1, h = length;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) {
                return mid;
            }
            if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return 0;
    }

    private static int BinSearch2(int[] arr, int length, int key) {
        int a = 1, b = length;
        while (a <= b) {
            int mid = a + b / 2;
            if (key==arr[mid])
                return mid;
            if(key < arr[mid])
                b= mid-1;
            else
               a =mid +1;
        }
        return 0;
    }
}




