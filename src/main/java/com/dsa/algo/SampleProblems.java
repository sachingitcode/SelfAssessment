package com.dsa.algo;

public class SampleProblems {
    public static void main(String[] args) {
        System.out.println(febinaciByRecursive(2));

    }

    //   1 1 2 3 5 8 13 
    //  1 2  3 =  6    
    private static int febinaciByRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + febinaciByRecursive(n - 1);
    }

}
