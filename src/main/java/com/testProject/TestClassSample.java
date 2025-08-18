package com.testProject;

import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;

public class TestClassSample {

    static void getLongestSubString() {
        String str = "appplepynlpp"; //
        var list = Arrays.asList(str.toCharArray());
        str.chars().mapToObj(cq -> (char) cq).collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder newStringBuilder = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) { // p l e p
                if (newStringBuilder.toString().length() > stringBuilder.toString().length()) {
                    stringBuilder = newStringBuilder;
                }
                newStringBuilder = new StringBuilder();
                set.clear();
                // newStringBuilder.append(ch);
                // set.add(ch);
            }
            {
                set.add(ch);
                newStringBuilder.append(ch); // ap
            }
        }
        var val = newStringBuilder.toString().length() > stringBuilder.toString().length() ? newStringBuilder.toString()
                : stringBuilder.toString();
        System.out.println(val);
    }

    static void getLongestSubString1() {
        String str = "appplepynlpp"; //
        List l1 = new ArrayList<>();
        HashMap<Character, List<String>> map = new HashMap<>();
        char a[] = {};
        int b = a.length;
        str.length();
        map.size();
        l1.size();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {

            }

        }
    }

    public static void main(String[] args) {
        getLongestSubString(); // startMerge();
    }

    private static void startMerge() {
        int[] arr = { 6, 1, 9, 5, 2, 3, 7, 4 };
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {

        }
    }

}
