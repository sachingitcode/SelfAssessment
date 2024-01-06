package com.advanceJava;

import java.util.StringJoiner;

public class StringJoiner1 {

    public static void main(String[] args) {

        // int a1[] = {1, 434, 9, 4, 4, 64, 33, 3};
        // int b[] = {1, 76, 4, 14, 64, 33, 3};
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("Hello");
        sj.add("How");
        sj.add("are");
        sj.add("You");
        System.out.println(" :-> " + sj);

        StringJoiner joinNames2 = new StringJoiner(":", "{", "}");  // passing colon(:) and square-brackets as delimiter   
  
        joinNames2.add("Peter");  
        joinNames2.add("Raheem");  
  
        // Merging two StringJoiner    // No use of 2nd Prefix and Suffix 
        //ie they are ignored in merge ; only 1st Suffix,prefix used. 
        //If Prefix Suffix not  Present in 1st and Present in 2nd , then also in result Prefix,suffix is not added
        StringJoiner merge = sj.merge(joinNames2);   
      
        System.out.println("Joiner After Merging  :-> " + merge);  


        String name = " Hi all name is Sachin and I am SSE";
        System.out.println(name.isBlank());
        int a[] = new int[5];// declaration and instantiation
        a[0] = 10;// initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        int arr[][] = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 4, 4, 5 } };
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
