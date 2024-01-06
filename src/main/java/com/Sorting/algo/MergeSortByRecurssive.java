package com.Sorting.algo;


/* Divide and Conquer ; Divide big problem in small and then Sort,
 * 
 */

public class MergeSortByRecurssive {

    public static void main(String[] args) {

        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int n = a.length;
        mergeSort(a, 0, n - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merges(a, beg, mid, end);
        }
    }

    static void merges(int a[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg; /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    /* Single Merging. It Requires 2 Sorted Lists */
    
}