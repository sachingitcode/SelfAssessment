package com.dsa.arr;


import java.util.Arrays;

public class array_2 {
    static int[] array = {1, 4, 3, 6, 9, 2, 6, 8};
    static int[] sortedarray = {1, 2, 3, 3, 5, 8, 9};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        reverseArrayUsing2Pointer();
    }

    private static void reverseArrayUsing2Pointer() {
        int start = 0;
        int end = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[end-i];
            array[end-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
