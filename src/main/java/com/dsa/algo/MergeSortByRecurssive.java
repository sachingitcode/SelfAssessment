package com.dsa.algo;

/* Divide and Conquer ; Divide big problem in small and then Sort,
Recursive is  top-down approch 
Itertive is bottom up approch
 * 
 */

public class MergeSortByRecurssive {

    public static void main(String[] args) {
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41, 4 };
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

    /*
     * Flow :
     * Create 2 Temp array to store left,right array and store right side to temp
     * right array ,same as left.
     * Merge left right and store in a[]
     * We create extra 2 array to put values back to a[]
     */

    static void merges(int a[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays.So we return values to a[] */
        for (int i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = a[mid + j + 1];

        /* Starting Merging from here. */
        int i = 0; /* initial index of first sub-array */
        int j = 0; /* initial index of second sub-array */
        int k = beg; /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j])
                a[k++] = LeftArray[i++];
            else
                a[k++] = RightArray[j++];
        }

        while (i < n1)
            a[k++] = LeftArray[i++]; // add remaining left arrays elements in main a[]
        while (j < n2)
            a[k++] = RightArray[j++]; // add remaining right array elements in main a[]

    }
    /* Single Merging. It Requires 2 Sorted Lists */

}