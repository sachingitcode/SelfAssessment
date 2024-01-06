package com.Sorting.algo;

import java.util.HashSet;
import java.util.Set;

 public class FindDuplicateByHashSet {
    public static void main(String[] args) {
        String names[] ={"", ""};
        Set<String> set = new HashSet<>();
        for (String name : names)
         { if (set.add(name) == false) {
            System.out.println("duplicate  : " + name);    
               } 
        }

   }
}
