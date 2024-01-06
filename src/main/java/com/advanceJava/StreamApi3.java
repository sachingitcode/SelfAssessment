package com.advanceJava;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Iterating  With Stream Api With Reduce 
/* Reduce()  takes a sequence of input elements 
and combines them into a single summary result
 by repeated operation.  */

public class StreamApi3 {
        public static void main(String[] args) {
                System.out.println("Hello   ");
                List<Student> list = CollectionUtils.getStudentList();

                System.out.println("Count Where Marks > 50  " +
                                list.stream()
                                                .filter(p -> p.marks > 50)
                                                .count());
                                              // Via Collectors  list.stream().collect(Collectors.counting());  
                System.out.println("Sum Where  " +
                                list.stream()
                                                .map(p -> p.marks)
                                                .reduce(0, Integer::sum));
                System.out.println("Total Sum marks Via Collectors " +
                                list.stream()
                                                .collect(Collectors.summingInt(x -> x.marks)));

                System.out.println("Sum For > 50   " +
                                list.stream()
                                                .filter(p -> p.marks > 50)
                                                .map(p -> p.marks) // use (Student :: getMarks) ie. method refrence
                                                                   // though Student should have getMarks()
                                                .reduce(0, Integer::sum));

                System.out.println(" Max  marks " +
                                list.stream()
                                                .max((p1, p2) -> (p1.marks - p2.marks))
                                                .get().marks);

                System.out.println(" Min  marks " +
                                list.stream()
                                                .min((p1, p2) -> (p1.marks - p2.marks))
                                                .get().marks);

                System.out.println(" Iterate  ");

                Map<String, Integer> nameRollMap = list.stream()
                                .collect(Collectors.toMap(p -> p.name, p -> p.roll));

                Stream.Builder<Map<String, Integer>> builder = Stream.builder();
                Stream<Map<String, Integer>> stream = builder.add(nameRollMap).build();
                System.out.println(" Getting Map Name , Roll");
                stream.forEach(System.out::println);

                System.out.println(" Getting Map Values Via Stream");

                Stream.builder().add(nameRollMap)
                                .build().forEach(System.out::println);
                // .forEach( map -> System.out.println(map.name));

        }
}
