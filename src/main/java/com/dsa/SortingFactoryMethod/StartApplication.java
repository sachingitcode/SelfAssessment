package com.dsa.SortingFactoryMethod;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;

public class StartApplication {

    public static void main(String[] args) {
        // To Start Sort Provide name
        int[] a = CollectionUtils.getIntArray();
        System.out.println("Array***"+ Arrays.toString(a));
        String sortName = "SimpleMatrixMultiply";
        new SortFactory()
                .startSortFactory(sortName)
                .startSort(a);
    }

}
