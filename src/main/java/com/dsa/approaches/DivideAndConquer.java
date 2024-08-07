package com.dsa.approaches;


//MergeSort
//QuickSort
//BinarySearch
//Strassen's Matrix Multiply
//Fast Fourier Transform (FFT)
public class DivideAndConquer {


    /* *
    BinarySearch(arr, target, left, right)
    if left > right
        return -1
    middle = left + (right - left) / 2
    if arr[middle] == target
        return middle
    else if arr[middle] > target
        return BinarySearch(arr, target, left, middle - 1)
    else
        return BinarySearch(arr, target, middle + 1, right)
    * */


    /* *
    MergeSort(arr, left, right)
    if left < right
        middle = (left + right) / 2
        MergeSort(arr, left, middle)
        MergeSort(arr, middle + 1, right)
        Merge(arr, left, middle, right)

Merge(arr, left, middle, right)
    n1 = middle - left + 1
    n2 = right - middle
    LeftArray[n1]
    RightArray[n2]
    for i = 0 to n1 - 1 ; JeftArray[i] = arr[left + i]
    for j = 0 to n2 - 1 ;  RightArray[j] = arr[middle + 1 + j]
    i = 0   j = 0  k = left
    while i < n1 and j < n2
        if LeftArray[i] <= RightArray[j]
            arr[k++] = LeftArray[i++]
        else
            arr[k++] = RightArray[j++]
    while i < n1
        arr[k++] = LeftArray[i++]
    while j < n2
        arr[k++] = RightArray[j++]
    * */
}
