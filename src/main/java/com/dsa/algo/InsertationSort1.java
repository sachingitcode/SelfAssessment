package com.dsa.algo;

public class InsertationSort1 {

    public static void main(String[] args) {
        int a[] = { 43, 8, 9, 2, 4,5,3};
        int n = a.length;

        for (int i = 0; i <= n; i++) {
            
            for (int j = i - 1; j > 0; j--) {
                
                if (a[j] < a[j - 1]) {
                    var t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }

            for (int m : a)
            System.out.print(m + " ");
            System.out.println("");
        }
    }
}
