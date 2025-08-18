package com.devoxx.LazyInitialization;


/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1:

Input: arr = [1,2,2,1,1,3]Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClassNew {

    public static void main(String[] args) {






        Integer arr[] = {1, 2, 2, 1, 1, 3,4};
        List<Integer> l = Arrays.asList(arr);
        Map<Integer, Long> map = l.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Long> entrySet = new HashSet<>(map.values());   //3, 2,1
       var value = entrySet.stream().reduce(0L, (a, b) -> a + b);
        System.out.println(entrySet);
        System.out.println(value);
        if(arr.length != value)
        { System.out.println("false");}
        else{
        System.out.println("true");}




//if(  entrySet)
//
//
//        for ( Map.Entry<Integer,Long> val : entrySet ){
//            val.
//        }
//
//        System.out.println(map);
//    }
    }
}


