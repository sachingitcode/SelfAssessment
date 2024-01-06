package com.advanceJava;

import java.util.Arrays;

public class ArraysQues {

    public static void main(String[] args) {

        int a[] = { 1, 434, 9, 4, 4, 64, 33, 3 };
        int b[] = { 1, 76, 4, 14, 64, 33, 3 };
        // StringJoiner js = new StringJoiner();
        int totalLength = a.length + b.length;

        int na[] = new int[totalLength];
        int ps = 0;
        for (int p : a) {
            na[ps] = p;
            ps++;
        }
        for (int p : b) {
            na[ps] = p;
            ps++;
        }
        Arrays.sort(na); 
        for (int x : na) {
            System.out.println(x);
        }
    }
    // System.arraycopy(a, 0, b, b.length, len);
    //System.out.println(a.length);


}
