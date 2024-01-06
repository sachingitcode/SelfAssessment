package com.coreJava;

import java.util.Arrays;

public class SimpleLogic1 {
    
    public static void main(String[] args) {
        int[] arr = {2,9,13,1,9 };
        int tmp = 0;
         
        System.out.println( "Highest No with its place");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > arr[tmp]  ) ) {
                tmp = i;
            } 
        }
        System.out.println(tmp);
        System.out.println(arr[tmp]);


    }


}
