package com.coreJava;

import java.util.Arrays;

public class TestSampleClass {


    private static void insertationSort(){
        int arr[] = {5,6,3,1,9,3} ;  // 5 6 3 1
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

    }

    public static void main(String[] args) {
        insertationSort();
        /*
        * 5,6,3,1,9
        *
        *
        *
        * */


//Bubble Sort
//        int arr[] = {5,6,3,1,9} ;
//        int len = arr.length-1;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }System.out.println(Arrays.toString(arr));
//            } System.out.println( "***"+Arrays.toString(arr));
//        }
//        System.out.println(Arrays.toString(arr));


//        int arr1[] ={1,2,3,4,5} ;  //5
//        int arr2[] ={4,1,3,5};  //4
//        int a = arr1.length;
//        int b = arr2.length;
//        int arr3[] = new int[a+b] ;
//        for(int i=0;i<a;i++){
//            arr3[i]=arr1[i];
//        }
//
//        for (int i=0;i<b;i++){
//            arr3[a+i]=arr1[i];
//        }
//        System.out.println(Arrays.toString(arr3));


        /***********************/
        /*Selection Sort ; here it takes the minimum element and replace*/
//        int arr[] = {5,6,3,1,9} ;
//        int len = arr.length;
//        for (int i=0;i<len;i++){
//            int p = i;
//            int max = arr[i];
//            for(int j=i;j<len;j++){
//                if (max > arr[j]){
//                    max  = arr[j];
//                    p=j;
//                }
//            }
//            arr[p]=arr[i];
//            arr[i]= max;
//        }
//        System.out.println(Arrays.toString(arr));
 /***************************/






    }
}
