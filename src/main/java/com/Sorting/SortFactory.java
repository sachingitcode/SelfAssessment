package com.Sorting;

import com.Sorting.Algos.*;

public class SortFactory {

    public Sorting startSortFactory(String sort){
        return switch (sort) {
            case "Selection" -> new SelectionSort();
            case "Bubble" -> new BubbleSort();
            case "Merge" -> new MergeSort();
            case "Insertion" -> new InsertionSort();
            case "Quick" -> new QuickSort();
            case "3WayMerge" -> new ThreeWayMergeSort();
            case "Arrays" -> new ArraysSort();
            case "Collections" -> new CollectionsSort();
            default -> throw new IllegalArgumentException("Unknown Algo " + sort);
        };
    }


}
