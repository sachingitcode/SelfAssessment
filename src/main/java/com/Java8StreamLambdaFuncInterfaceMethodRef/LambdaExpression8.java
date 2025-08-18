package com.Java8StreamLambdaFuncInterfaceMethodRef;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Data
@Builder
@AllArgsConstructor
class Person {
    String name;
    int age;
}

public class LambdaExpression8 {

    public static void main(String[] args) {
        new LambdaExpression8().sortMethod();

        add2List();
        reverseList();
        reverseString();
    }

    private static void add2List() {

         List<String> l1 = new java.util.ArrayList<>();
        l1.add("A");
        l1.add("B"); // We can not use List..of() bcause it is immutable and can use addAll on that
        List<String> l2 = List.of("v", "x");
        List l3 = Stream.builder().add(l1).add(l2).build().toList();// [[a, b], [v, x]]

        var l4 = Stream.concat(l1.stream(), l2.stream()).toList(); // [a, b, v, x]
        System.out.println(l3);
        System.out.println(l4);
        l1.addAll(l2);
        System.out.println(l1);
    }

    private void sortMethod() {
        List<String> words = List.of("apple", "banana", "kiwi");
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparing(String::length)) //

                .sorted(String::compareTo)
                .sorted(testMethod())
                .collect(Collectors.toList());
        System.out.println("Sorted Words by Length: " + sortedWords);
    }

    // Note Wrapper class have compareTo method
    private Comparator<? super String> testMethod() {
        return String::compareTo;
    }

    private static void reverseList() {
    }

    private static void reverseString() {
        String app = "apple";

        app.chars()
                .mapToObj(c -> String.valueOf((char) c)) // This step is imp
                .reduce("", (a, b) -> b + a)
                .toString();

        String input = "hello";
        String reversed = 
        input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);
        System.out.println("Reversed String: " + reversed);

        // sum of digit
        String a = "1234";

        var s = a.chars()
                .mapToObj(c -> ((char) c))
                .map(Character::getNumericValue)
                .reduce(0, (a1, b1) -> a1 + b1);

        List<String> wordList = List.of("apple", "banana", "kiwi", "abcd", "abcde", "banana");
        wordList.stream()
                .sorted(Comparator.comparing(String::length))
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(System.out::println);


        wordList.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);


        Map<String, List<String>> grouped = wordList.stream()
                .collect(Collectors.groupingBy(Function.identity()));   // it means x -> x  // mostly used in map where we provide key as x only
        // / toMap(x->x , x->x

        Map<String, List<String>> grouped1 = wordList.stream()
                .collect(Collectors.groupingBy(x -> x));


        System.out.println("Grouped Words: " + grouped);


        var a1 = wordList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(a1);

        List<Person> list = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25));

        var v = list.stream()
                .collect(Collectors.groupingBy(Person::getName));
        System.out.println(v);

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        var p1 = list1.stream()
                .filter(u -> list2.contains(u)) // !
                .toList();
        System.out.println(p1);

        // 37. Count Occurrences/counts of Each Vowel in String // "apple"
        var aaa = app.chars()
                .mapToObj(c -> (char) c)
                .filter(c1 -> "aeiou".contains(c1.toString()))  //.filter(Character::isDigit) to filter only charasters
                .collect(Collectors.groupingBy(cg -> cg, Collectors.counting()));

        System.out.println(aaa);

        // Reverse a List Using Streams
        System.out.println(wordList.reversed().stream().toList());

        //40. Reverse a String Using Streams
        String revers = new StringBuilder("hello").reverse().toString();


//        String reversed1 = Stream.of(input.split(""))
//                .collect(Collectors.collectingAndThen(Collectors.toList(),
//                        list -> {
//                            Collections.reverse(list);
//                            return String.join("", list);
//                        }));System.out.println(reversed1);

//
        String reversed1 = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a2, b2) -> b2 + a2);
        System.out.println("Reversed String: " + reversed);

        //41. Find the Most Frequent Element in  List
        input.chars()
                .mapToObj(c -> ((char) c))
                //  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);


        // Check if a String is a Palindrome NAMAN
        String inp = "madam";
        boolean isPalindrome = IntStream.range(0, inp.length() / 2)
                .allMatch(i -> inp.charAt(i) == inp.charAt(inp.length() - 1 - i));

        System.out.println(
                "abcdaabbccc".chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting())));


        //       47. Generate the Fibonacci Sequence Using Streams
         IntStream.range(0,10)
         .reduce( 1, (aaaa,bbbb)-> aaaa*bbbb )
         ;

        //   52. Find the Longest Palindrome in a List of Strings

//54. Find the Longest Word in a String


        //58. Find the Number of Characters in a File
        //59. Find the Number of Words in a File


        //61. Process a CSV File and Calculate Aggregate Statistics

// Reverse String 1. chars . mapToObj ( String.valueOf ) ,reduce( "",(a,b)-> b+a)
        var sss = "sachin".chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (s1, s2) -> s2 + s1);
        System.out.println("----" + sss);


        int arr[] = {1, 35, 7, 9, 6};
        ArrayList l1 = new ArrayList(   3);
        List l = Arrays.asList(arr);


    }
}


//Reverse a String Using Streams

