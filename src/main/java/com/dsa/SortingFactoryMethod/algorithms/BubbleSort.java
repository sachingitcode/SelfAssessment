package com.dsa.SortingFactoryMethod.algorithms;

import com.dsa.SortingFactoryMethod.Sorting;

import java.util.Arrays;

public class BubbleSort implements Sorting {

    @Override
    public void startSort(int[] arr) {
        Sort(arr);
    }

    /* Here swapped is used to check, if inner loop has j > j+1 or not. once it is false means
    * all `j+1`  are already greater . so no more checking required  */

    public void Sort(int[] arr) {
        var n = arr.length;//n
        int i, j;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            System.out.println(i + "** " + Arrays.toString(arr));
            if (!swapped)
                break; // System.out.println("No need for more swap" + Arrays.toString(arr));
            //If no two elements were/swapped by inner loop, then break MEANS they are already swapped
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}


/*  here we will notice that for 1 round, we are getting 1 greater number ,in every round. 99 then 81 then72 ...

****[72, 11, 44, 19, 43, 46, 37, 99, 26, 81, 35, 14, 64, 33, 63]
0** [11, 44, 19, 43, 46, 37, 72, 26, 81, 35, 14, 64, 33, 63, 99]
1** [11, 19, 43, 44, 37, 46, 26, 72, 35, 14, 64, 33, 63, 81, 99]
2** [11, 19, 43, 37, 44, 26, 46, 35, 14, 64, 33, 63, 72, 81, 99]
3** [11, 19, 37, 43, 26, 44, 35, 14, 46, 33, 63, 64, 72, 81, 99]
4** [11, 19, 37, 26, 43, 35, 14, 44, 33, 46, 63, 64, 72, 81, 99]
5** [11, 19, 26, 37, 35, 14, 43, 33, 44, 46, 63, 64, 72, 81, 99]
*  ... ... ...
* */