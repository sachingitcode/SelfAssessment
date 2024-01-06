package com.Sorting;

public class StartApplication {

    public static void main(String[] args) {
        // To Start Sort Provide name
        String sortName = "";
        new SortFactory()
                .startSortFactory(sortName)
                .startSort();
    }

}
