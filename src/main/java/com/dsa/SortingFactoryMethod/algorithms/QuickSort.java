package com.dsa.SortingFactoryMethod.algorithms;

import com.dsa.SortingFactoryMethod.Sorting;

import java.util.Arrays;

public class QuickSort implements Sorting {

    @Override
    public void startSort(int[] a) {
        quickSort(a, 0, a.length);
        System.out.println("Sorted array " + Arrays.toString(a));
    }

    private void quickSort(int[] a, int i, int h) {
        if (i < h) {
            int mid = partition(a, i, h);
            //  quickSort(a, i, mid);
            //      quickSort(a, mid + 1, h);
        }
    }

    public int partition(int[] a, int l, int h) {
        int i = l, j = h;
        int ele = a[l];
        while (i < j) {
            do {
                i++;
            } while (a[i] < ele);
            do {
                j--;
            } while (a[j] > ele);
            if (i < j) {
                System.out.println(" Match " + a[i] + "..." + a[j]);
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp; //swap
                System.out.println(" Swap " + a[i] + "..." + a[j] + "");
                System.out.println("Sorted array " + Arrays.toString(a));
            }
        }
        int t2 = a[j];
        a[j] = a[l];
        a[l] = t2;
        System.out.println("Extended array " + Arrays.toString(a));
        return j;
    }

}
