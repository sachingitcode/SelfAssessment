package com.dsa.SortingFactoryMethod.algorithms;

import com.dsa.SortingFactoryMethod.Sorting;

public class SimpleMatrixMultiply implements Sorting {

    @Override
    public void startSort(int[] a) {
        startMultiple();
        int[][][] matrix = {{{1}, {2}, {2}, {1}, {2}, {2}, {2}, {1, 5}},
                {{5}, {6}, {2}, {1}, {5, 6, 7, 8, 9}},
                {{5, 6, 7, 8, 9}},
                {{9, 9, 9, 9, 9}}
        };
        print3DMatrix(matrix);
    }

    private void startMultiple() {
        int[][] matrix1 = {{1, 2, 3},
                           {4, 5, 6}};
        int[][] matrix2 = {{7, 8},
                          {9, 10},
                          {11, 12}};
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;


//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//                for (int k = 0; k < ; k++) {
//
//                }
//            }
//        }
    }


    public static void print3DMatrix(int[][][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
