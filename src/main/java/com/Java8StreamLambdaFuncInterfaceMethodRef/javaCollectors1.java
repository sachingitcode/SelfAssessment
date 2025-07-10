package com.Java8StreamLambdaFuncInterfaceMethodRef;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Teacher {
    public int roll;
    public String name;
    public String dept;
    public int marks;
}

public class javaCollectors1 {

    public static List<Teacher> getTeacherList() {
        List<Teacher> list = new LinkedList<>();
        list.add(new Teacher(4, "Sachin", "Phy", 50));
        list.add(new Teacher(2, "Rahul", "Chem", 53));
        list.add(new Teacher(1, "Amita", "Arts", 22));
        list.add(new Teacher(3, "Yatin", "Math", 73));
        list.add(new Teacher(4, "Puneet", "Eco", 14));
        list.add(new Teacher(6, "Pooja", "Arts", 82));
        list.add(new Teacher(8, "Manish", "Math", 12));
        return list;
    }

    static List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

    public static void main(String[] args) {
        var collect1 = list.stream().collect(Collectors.toMap(key -> key, String::length));
        //      var collect2 = list.stream().collect(Collectors.toMap(String::length, key -> key)); // It will give error as it can have duolicate keys
        var collect3 = list.stream().collect(Collectors.toMap(String::length, key -> key, (key1, key2) -> key2));
        var collect4 = list.stream().collect(Collectors.toMap(String::length, key -> key, (key1, key2) -> key1 + ":" + key2));

        System.out.println(collect1);
        //  System.out.println(collect2);
        System.out.println(collect3);
        System.out.println(collect4);

        var collect5 = list.stream().collect(Collectors.toCollection(TreeSet::new));  //toMap(key -> key, String::length
        System.out.println(collect5);

        list.stream().collect(Collectors.joining(":", "{", "}"));
        System.out.println("*******");


        // var collect6 = list.stream().collect(Collectors.toCollection( HashMap::new ));  //toMap(key -> key, String::length

        Map<String, List<Teacher>> collect = getTeacherList().stream()
                .collect(Collectors.groupingBy(Teacher::getDept));


        System.out.println(collect);
        collect.entrySet().stream();


        // partitioned by
        //  Java always partitions a stream into 2 groups based on a predicate — meaning a function that returns true or false.
        // the key in the resulting Map is always a Boolean (true or false).
        //
        //Partioned
        //grouping by

        //

    }
}
