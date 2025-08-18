package com.multiThreading;

public class SampleJavaClass {

    public static void main(String[] args) {
        int arr[] = {3, 3, 5, 0, 0, 3, 5, 2, 6, 0, 1, 4, 0};
        // int arr2[] = {1,2, 3,4,5};
        //  int arr3[] = {1,2,5,9, 3,4,5};
        int max = 0;
        int premax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] - arr[i] > premax) {
                    premax = arr[j] - arr[i];
                }

            }
        }

        //  System.out.println("<UNK-Start>"+arr[start]+"<UNK-end>"+arr[end]);
        //     System.out.println( arr[start]- arr[end]);
        System.out.println(max);
        System.out.println(premax);

    }

}
