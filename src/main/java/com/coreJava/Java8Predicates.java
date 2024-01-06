package com.coreJava;

import java.util.List;
import java.util.function.Predicate;


public class Java8Predicates {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 01, 11, 12);

        System.out.println(totalValues(list, selector -> true));
        System.out.println(totalValues(list, selector -> true));
        System.out.println(totalValues(list, number -> number % 2 == 0));
        System.out.println(totalValues(list, Java8Predicates :: isOdd  ));
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
        var total = 0;
        for (Integer number : numbers) {
            if (selector.test(number)) {
                total += number;
            }
        }
       // return total;

       
       return  numbers.stream()
        .filter(selector)
        .mapToInt(e -> e)
        .sum();

    }
}
