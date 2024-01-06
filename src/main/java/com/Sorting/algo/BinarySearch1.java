package com.Sorting.algo;

import java.util.Arrays;
import com.advanceJava.CollectionUtils;

/* Time taken :  min 1 ; max logn */

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

}
