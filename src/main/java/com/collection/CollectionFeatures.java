package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import oracle.net.aso.c;

public class CollectionFeatures {
    public static void main(String[] args) {
        concurrentException();
        collectorFeatures();

    }

    private static void concurrentException() {
        List<Integer> list1 = List.of(3, 5, 8, 9); // It returns immutable list , so we cannot change it
        // list1.add(6); // We cannot modify it

        List ll = Arrays.asList(1, 4, 6, 9);
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 9)); // it is mutalbe list
        list.add(5);

        // for (int i : list) {
        // list.add(i);
        // }
        // you're modifying the list while iterating over it.

        List<Integer> list2 = List.of(2, 4, 6, 9);

        // for (int i : list) {
        // list.add(i);
        // }

        // you're modifying the list while iterating over it.
    }

    private static void collectorFeatures() {

        Emp e1 = new Emp("hr", "sachin", 9);
        Emp e2 = new Emp("hr", "amit", 6);
        Emp e3 = new Emp("sale", "yatin", 3);
        Emp e4 = new Emp("mech", "vijay", 6);
        Emp e5 = new Emp("sale", "abc", 2);
        Emp e6 = new Emp("mech", "pnt", 4);
        // var l1 = List.of("aa", "bbb", "cccc", "ddddd", "aa", "bbb", "aa", "bbb",
        // "cccc");
        var l2 = List.of(5, 7, 3, 4, 8, 5, 1, 7, 5, 9, 8);
        var l3 = List.of(e1, e2, e3, e4, e5, e6);

        l2.stream().max(Integer::compareTo);

        // var tmp1 = l1.stream().collect(Collectors.groupingBy(String::length)); // x
        // -> x,

        Collectors.mapping(Emp::getSalary, Collectors.toList());

        var tmp2 = l3.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
        var tmp4 = l3.stream()
                .collect(Collectors.groupingBy(Emp::getDept, Collectors.maxBy(Comparator.comparing(Emp::getSalary))));

        System.out.println(tmp4);

        Collectors.summingInt(Emp::getSalary);

        // Collectors.toCollection(LinkedList :: new);

        l3.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 5000));

        l3.stream().collect(Collectors.groupingBy(Emp::getDept));

        var tt = l3.stream().collect(Collectors.groupingBy(Emp::getDept));

        // Collectors.partitioningBy(e -> e.get);
        System.out.println("****");
        System.out.println(tt);

        var tt1 = l3.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.summingInt(Emp::getSalary)));
        System.out.println(tt1);

        var tt2 = l3.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.summingInt(Emp::getSalary)));

        // get max length string ,, get no of aa , bb , // sort // sort 2nd list
        // get
        var l1 = List.of("aa", "bbb", "cccc", "ddddd", "aa", "bbb", "aa", "bbb", "cccc");

        var t4 = l1.stream().max(Comparator.comparing(String::length));
        System.out.println(t4);

        var t5 = l1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(t5);

        var t6 = l2.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(t6);

        // Collections.sort(l1, Comparator.comparing(String::length));

        // Collections.sort(l3, Comparator.comparing(Emp::getSalary)); l3 is immutable
        // Collections.sort(l3, Comparator.comparing(Emp::getDept)); l3 is immutable

        // e Product of All Elements in a List

        System.out.println(l2.stream().reduce(1, (a, b) -> a * b));

        //
        System.out.println(l2.stream().collect(Collectors.summingInt(x -> x)));

        // Maximum Element in a List
        System.out.println(l2.stream().max(Comparator.comparing(x -> x))); // Integer::intValue

        // Last Element in a List
        System.out.println(l2.stream().reduce(0, (a, b) -> (b)));

        System.out.println(l2.stream().reduce((a, b) -> (b)));

        // a List of Integers in Descending Order
        l1.stream().sorted().toList();

        // 19. Sort a List of Strings in Alphabetical Order
        System.out.println(l2.stream().sorted().toList());

        // 21. Find the Sum of Digits of a Number
        int a = 12345;

        String.valueOf(a).chars()
                // .mapToObj(c -> (chars) c)
                .map(Character::getNumericValue) /// its should CharSequence
                .sum();

        String.valueOf(a).chars()
                .map(Character::getNumericValue)
                .sum();

        // 23. Find the Second-Largest Element in a List

        System.out.println(l2.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

        // 25. Find the Longest String in a List

        l1.stream().max(Comparator.comparing(String::length));

        // 26. Find the Shortest String in a List

        System.out.println(l1.stream().max(Comparator.reverseOrder()));

        // parttion by even odd
        System.out.println(l2.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)));

        List l4 = List.of(1, 2, 3, 4, 5);
        List l5 = List.of(3, 4, 5, 6, 7, 8);
        // 32. Find the Union of Two Lists

        l4.stream().filter(l5::contains).toList();

        // Merge Two Lists into a Single List
        Stream.concat(l4.stream(), l5.stream()).toList();

        // l4.concat()

        ;
        // if a List Contains a Specific Element

    }

}

@Data
@AllArgsConstructor
class Emp {
    String dept, name;
    int salary;
}

class GenEmp<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}

// Sort
// Collections.sort
//