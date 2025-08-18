package com.dsa.algo;
//  Product of Array Except for Self 

import java.lang.reflect.Array;
import java.util.Arrays;

public class MockTest1 {
    public static void main(String[] args) {
        int[] a = { 6, 1, 9, 5, 2, 3, 7, 4 };
        // merger(a, 0, 7);
        // mergeFunc(a, 0, 7);

        int b[] = { 1, 3, 5, 9 };
        int c[] = { 2, 5, 6, 7, 9, 11, 13, 15, 19 };
        merge2SortedArray(b, c);

    }

    private static void mergeFunc(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + end / 2;
            mergeFunc(arr, start, mid);
            mergeFunc(arr, mid + 1, end);
            mergingMethod(arr, start, mid, end);
        }
    }

    private static void mergingMethod(int[] arr, int start, int mid, int end) {

        int n = mid - start;
        int[] tmp1 = new int[n];

        int m = end - mid;
        int[] tmp2 = new int[m];

        for (int i = 0; i < n; i++) {
            tmp1[i] = arr[start + i];
        }
        for (int i = 0; i < m; i++) {
            tmp2[i] = arr[start + i];
        }

        int o = 0, p = 0, k = 0;

        while (o < n && p < m) {
            if (tmp1[o] < tmp2[p]) {
                arr[k] = tmp1[o];
                k++;
                o++;
            } else {
                arr[k] = tmp2[p];
                k++;
                p++;
            }
        }

        for (; o < n; o++) {
            arr[k] = tmp1[o];
        }
        for (; p < m; p++) {
            arr[k] = tmp2[p];
        }

    }

    private static void twoWayMerge(int[] a, int beg, int mid, int end) {
        
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

    private static void merge2SortedArray(int[] a, int[] b) {
        int l = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;
        // int tmp1[] = new int[l];
        // int tmp2[] = new int[m];
        int tmp3[] = new int[l + m];

        // for (int n = 0; n < a.length; n++) {
        // tmp1[n] = a[n];
        // }
        // for (int n = 0; n < b.length; n++) {
        // tmp2[n] = b[n];
        // }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        while (i < l && j < m) {
            if (a[i] < b[j]) {
                tmp3[k++] = a[i++];
            } else {
                tmp3[k++] = b[j++];
            }
        }
        // for (; i < l;) {
        // tmp3[k++] = a[i++];
        // }

        while (i < l) {
            tmp3[k++] = a[i++];
        }

        while (j < m) {
            tmp3[k++] = b[j++];
        }

        // for (; j < m;) {
        // tmp3[k++] = b[j++];
        // }
        System.out.println(Arrays.toString(tmp3));
    }
}
