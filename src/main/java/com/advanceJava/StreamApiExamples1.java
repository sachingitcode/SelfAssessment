package com.advanceJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamples1 {

    public static void main(String[] args) {
        System.out.println("3 Power of 8 ie 8*8*8 : " + (int) Math.pow(8, 3));
        printEvenNums();

        System.out.println("Getting Duplicates");
        findDuplicateinList();

    }

    static void findDuplicateinList() {
        List<Integer> list = List.of(1, 3, 53, 2, 5, 2, 1, 53, 2, 23, 53, 3);

        // 1. BY Normal Way
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);

        map.entrySet().stream()
        .filter(en -> en.getValue() > 1)
        .forEach(System.out::print);

        //2  Another Way :: By Stream() and Set 
        var set = new HashSet<Integer>(); 
        list.stream()
                .filter(n -> !set.add(n) )    // Elements which are not entered in Set as Set dont allow duplicates
                .forEach(System.out::print);

 // 3. BY  Collections.frequency

 System.out.println("");

 System.out.println("Getting Duplicates BY Collection.Frequency");

 list.stream()
 .filter(n -> Collections.frequency(list, n) > 1 )    // Elements which are not entered in Set as Set dont allow duplicates
 .collect(Collectors.toSet());


    }

    static void printEvenNums() {
        Stream.iterate(1, i -> i + 2)
                .limit(5)
                .forEach(System.out::print);
        System.out.println("");
        // merge all those lists to create a single list , It can have duplicates
        Stream.of(
                Arrays.asList("Asia", "India", "Paks", "Nepal", "Liberia", "Mali", "Mauritius"),
                Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"),
                Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece",
                        "Iceland"))
                .flatMap(List::stream)
                .forEach(System.out::print);
        System.out.println("");
        // .collect(Collectors.toList());
    }
}
