package com.Sorting.algo;

/*
 * Merge Sort is Combine/merge 2 Smaller SORTED list into 1 Single SORTED List
 */
public class MergeSort1 {
    public static void main(String[] args) {
        int a[] = { 3, 5, 7,18};
        int b[] = { 1, 3, 4, 7, 19, 21, 24 };
        int c[] =  Merge(a, b);
     
        for(int i=0;i<c.length;i++)  {
        System.out.println(c[i]);  
        }
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
