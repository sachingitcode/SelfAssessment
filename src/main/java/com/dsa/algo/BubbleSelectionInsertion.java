package com.dsa.algo;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;

public class BubbleSelectionInsertion {

    public static void main(String[] args) {
        int a[] = CollectionUtils.getShortIntArray();
        System.out.println("Initial " + Arrays.toString(a));
        // selectionSortMethod(a);
        insertationSort(CollectionUtils.getShortIntArray());
        // bubbleSort(CollectionUtils.getIntArray());

        System.out.println("************");
        selectionSort(CollectionUtils.getShortIntArray());

    }

    // find shortest and put at front
    private static void insertationSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int a[]) {
        for (int i = 0; i <= a.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    var t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSortMethod(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[i] < a[j - 1]) {
                    a[j] = a[j - 1];
                    a[j - 1] = a[i];
                }
            }
        }
    }

    // 3,4, 2,1 5,4 ,
    // 3,4, 2,1 5,4
    // 3,2, 4
    // 3,2, 1, 4
    // 3,2, 1, 4 ,5
    // 3,2, 1, 4 ,4,5

    // 2,3
    // 2,1,3
    // 2,1,3,4,4,5
    //

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(a));
    }

}
