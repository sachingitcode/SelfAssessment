package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionFeatures {
    public static void main(String[] args) {
        concurrentException();
    }

    private static void concurrentException() {
        List<Integer> list1 = List.of(3, 5, 8, 9);  // It returns immutable list , so we cannot change it
        //  list1.add(6); // We cannot modify it

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 9)); // it is mutalbe list
        list.add(5);

//        for (int i : list) {
//            list.add(i);
//        }
        // you're modifying the list while iterating over it.


        List<Integer> list2 = List.of(2, 4, 6, 9);


//        for (int i : list) {
//            list.add(i);
//        }

        // you're modifying the list while iterating over it.
    }


}

