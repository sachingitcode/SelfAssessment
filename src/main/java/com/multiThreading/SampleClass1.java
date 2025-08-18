package com.multiThreading;

import java.util.Comparator;
import java.util.List;

public class SampleClass1 {
    public static void main(String[] args) {

        int[][] arr= { {1,2,3},
                      {4,5,6},
                      {7,8,9}
                              };
        //  1 4 7  2 5 8  3 6 9
        //7 ,4 1,  8,5 ,2 , 9, 6 ,3
        rotate90(arr);

    }

    private static void rotate90(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
                var tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
int n=mat.length   ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                var tmp = mat[i][j];
                mat[i][j] = mat[i][mat[i].length - j - 1];
                mat[i][mat[i].length - j - 1] = tmp;
            }
        }

        System.out.println("   ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }

    }

}