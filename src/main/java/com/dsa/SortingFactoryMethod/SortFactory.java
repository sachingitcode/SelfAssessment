package com.dsa.SortingFactoryMethod;

import com.dsa.SortingFactoryMethod.algorithms.*;

public class SortFactory {

    public Sorting startSortFactory(String sort){
        return switch (sort) {
            case "SelectionSort" -> new SelectionSort();
            case "BubbleSort" -> new BubbleSort();
            case "MergeSort" -> new MergeSort();
            case "InsertionSort" -> new InsertionSort();
            case "QuickSort" -> new QuickSort();
            case "ThreeWayMergeSort" -> new ThreeWayMergeSort();
            case "ArraysSort" -> new ArraysSort();
            case "CollectionsSort" -> new CollectionsSort();
            case "SimpleMatrixMultiply" -> new SimpleMatrixMultiply();
            case "MatrixMultiplyDivideAndConquer" -> new MatrixMultiplyDivideAndConquer();
            default -> throw new IllegalArgumentException("Unknown Algo " + sort);
        };
    }


}
