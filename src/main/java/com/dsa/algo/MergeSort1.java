package com.dsa.algo;

import java.util.Arrays;

/*
 * Merge Sort is Combine/merge 2 Smaller SORTED list into 1 Single SORTED List
 */
public class MergeSort1 {
    public static void main(String[] args) {
        int a[] = { 3, 5, 7,18};
        int b[] = { 1,  4, 19, 21, 24 };
        int c[] =  Merge(a, b);

        int d[]= newMerge(a,b);

        for(int i=0;i<c.length;i++)  {
        System.out.println(c[i]);  
        }
    }

    static int[] newMerge(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int c[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        for ( k = 0; k<= m+n  ; k++  ) {
            System.out.println("Early "+ Arrays.toString(c));
            if (a[i] < b[j]) {
                c[k] = a[i++];
            } else {
                c[k] = b[j++];
            }
            System.out.println("Arr "+ Arrays.toString(c));
        }

//        for (; i < m;) {c[k++] = a[i++]; }  // elements remains in a
//        for (; j < n;) {c[k++] = b[j++]; }  // elements remains in a
        System.out.println("Arr "+ Arrays.toString(c));
        return c;
    }


    static int[] Merge(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int c[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];    // Inserting and Incrementing
        }
        for (; i < m;) {c[k++] = a[i++]; }
        for (; j < n;) {c[k++] = b[j++]; }
        return c;
    }

    static int[] Merge1(int[] a, int[] b) {
        int m=a.length ,  n=b.length;
        int c[] = new int[ m + n ];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
    for(;i<m;i++){ c[k++] = a[i];}
    for(;j<n;j++){ c[k++] = b[j];}
    return c;
    }

}
