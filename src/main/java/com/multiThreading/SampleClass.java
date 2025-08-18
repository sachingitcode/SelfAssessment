package com.multiThreading;


import java.util.*;
import java.util.stream.Collectors;

public class SampleClass {

    public static void getTopTwoDifferences() {
        int arr[] = {3, 1, 3, 4, 5, 8, 4, 3, 4, 7, 3, 2, 1};
        int n = arr.length;
        int minVal = arr[0];
        List<Integer> allValidDiffs = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (arr[i] > minVal) { //
                int diff = arr[i] - minVal;
                allValidDiffs.add(diff);
            } else {
                minVal = Math.min(minVal, arr[i]);// 1
            }
        }
        System.out.println("-> "+allValidDiffs);
        // Sort and pick top 2
        allValidDiffs.sort(Collections.reverseOrder());

        List<Integer> top2 = new ArrayList<>();
        for (int i = 0; i < Math.min(2, allValidDiffs.size()); i++) {
            top2.add(allValidDiffs.get(i));
        }

        System.out.println("top2: "+ top2);
    }


    public static void main(String[] args) {
        getTopTwoDifferences();
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        map.put("D", 2);
        map.put("E", 1);
        map.put("F", 4);
// sorted based on values

        List<String> list4 = List.of("a", "b", "cw", "dw", "eeee", "fffff");
        // geet count  and values
        System.out.println(list4.stream().collect(Collectors.groupingBy(String::length)));
        // get values and count
        System.out.println(list4.stream().collect(Collectors.toMap(k -> k, k -> k.length())));


        Set sets = Collections.singleton(map.values());
        List list = Collections.singletonList(map.values());
        List l2 = new ArrayList(map.values());

        Collections.sort(list);
        Map map1 = new LinkedHashMap<>();

        Set<Map.Entry<String, Integer>> entr = map.entrySet();
        for (Map.Entry<String, Integer> e1 : entr) {
            for (var valz : list) {

            }
        }
        // getValue()


        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for (var entry : set) {

        }


    }


}
