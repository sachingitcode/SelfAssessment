package com.dsa.algo;

import com.advanceJava.CollectionUtils;

import java.util.Arrays;

/* Here we use divide and conquer, which near we divide the large problem into small problem
 * and find the solution and join the result    */
/* Time taken :  min 1 ; max log n

* Used to find the element from sorted list ,
*  */
public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int a[] = CollectionUtils.getIntArray();
        Arrays.sort(a);
        System.err.println("63 at Position : " + binSearch(1, a.length, a, 63));
    }

    private static int binSearch(int l, int h, int[] arr, int key) {
        if (l == h) {    // small problem,
            if (key == arr[l]) return l;  // checking if at smallest,if value matches then returning location, else -1;
            else return -1;
        } else {        // Larger segment,where dividing into smaller, by calling itself.
            int mid = l + h / 2;
            if (key == arr[mid]) return mid;  // checking mid
            if (key < arr[mid]) binSearch(l, mid - 1, arr, key); // calling left side,if key is smaller
            else binSearch(mid + 1, h, arr, key);               // calling right side if key is bigger
        }return 0;
    }

    private static int BinSearch2(int[] arr, int length, int key) {
        int a = 1, b = length;
        while (a <= b) {  // looping / jumping to find the key
            int mid = a + b / 2;
            if (key == arr[mid])
                return mid;
            if (key < arr[mid])
                b = mid - 1;
            else
                a = mid + 1;
        }
        return 0;
    }
}




