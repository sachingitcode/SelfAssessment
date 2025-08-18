package com.dsa.algo;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class BubbleSelectionInsertion {


    private static void insertationSort(){
        int arr[] = {5,6,3,1,3,9} ;  // 5 6 3 1
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for(int j = i; j >0; j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] =arr[j-1] ;
                    arr[j-1]=tmp;
                }
            }
        }
        System.out.println("$$$$" +Arrays.toString(arr));
    }

 private static void  swap(int []arr ,int i ,int j){
        int tmp = arr[i];
         arr[i] =arr[j] ; arr[j]=tmp;
    }

    private static void bubbleSort(){
        int arr[] = {5,6,3,1,9} ;
        int len = arr.length-1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }System.out.println(Arrays.toString(arr));
            } System.out.println( "***"+Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

private static void selectionSort() {
    /*Selection Sort ; here it takes the minimum element and replace*/
    int arr[] = {5,6,3,1,9} ;
    int len = arr.length;
    for (int i=0;i<len;i++){
        int p = i;
        int max = arr[i];
        for(int j=i;j<len;j++){
            if (max > arr[j]){
                max  = arr[j];
                p=j;
            }
        }
        arr[p]=arr[i];
        arr[i]= max;
    }
    System.out.println(Arrays.toString(arr));
}

/*Insertation sort
* 4,7,5,2,6
* 4,5,7,2,6
* 4,5,7
* 2,4,5,7,6
* */











    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int max = numbers.stream().max(Integer :: compareTo).orElse(0);
        System.out.println("Max: " + max);
        int a[] = CollectionUtils.getShortIntArray();
        System.out.println("Initial " + Arrays.toString(a));
        // selectionSortMethod(a);
        int b[] = {6, 5, 3, 4, 7};
        int c[] = {6, 5, 3, 4, 7};
        insertationSort(b);
        bubbleSort(c);

        System.out.println("************");
   //     selectionSort(CollectionUtils.getShortIntArray());

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
         //   System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }

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

//    private static void selectionSort(int a[]) {
//        for (int i = 0; i <= a.length; i++) {
//            for (int j = i - 1; j > 0; j--) {
//                if (a[j] < a[j - 1]) {
//                    var t = a[j];
//                    a[j] = a[j - 1];
//                    a[j - 1] = t;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }
//
//    private static void selectionSortMethod(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (a[i] < a[j - 1]) {
//                    a[j] = a[j - 1];
//                    a[j - 1] = a[i];
//                }
//            }
//        }
//    }

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


}
