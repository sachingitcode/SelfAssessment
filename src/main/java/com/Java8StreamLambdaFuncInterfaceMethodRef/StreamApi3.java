package com.Java8StreamLambdaFuncInterfaceMethodRef;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
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
        List<Studs> list = new LinkedList<>();
        list.add(new Studs(4, "Sachin", "Phy", 50));
        list.add(new Studs(2, "Rahul", "Chem", 53));
        list.add(new Studs(1, "Amita", "Arts", 22));
        list.add(new Studs(3, "Yatin", "Math", 73));
        list.add(new Studs(4, "Puneet", "Eco", 14));
        list.add(new Studs(6, "Pooja", "Mech", 82));
        list.add(new Studs(8, "Manish", "Comp", 12));


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
                        .map(p -> p.marks) // use (  Studs :: getMarks) ie. method refrence
                        // though   Studs should have getMarks()
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

@Data
@AllArgsConstructor
class Studs {
    int roll;
    String name;
    String dept;
    int marks;
}