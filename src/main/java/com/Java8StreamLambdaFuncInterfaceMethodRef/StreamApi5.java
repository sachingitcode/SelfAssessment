package com.Java8StreamLambdaFuncInterfaceMethodRef;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
class Studentz {
    public int id;
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class StreamApi5 {
    public static void main(String[] args) {
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(5);

        streamGenerated.forEach(System.out::println);

        mapMethod();
        flatMapMethod1();
        flatMapMethod2();

    }

    private static void flatMapMethod1() {
        var studentz = new Studentz(1, "Maverick", 18);
        var studentz2 = new Studentz(2, "Sam", 28);
        var studentz3 = new Studentz(3, "Sampy", 38);
        var studentz4 = new Studentz(4, "Sampo", 15);
        var studentz5 = new Studentz(5, "Sahil", 25);

        List l1 = List.of(studentz, studentz2);
        List l2 = List.of(studentz3, studentz4, studentz5);

        List<List<Studentz>> l3 = List.of(l1, l2);
        l3.forEach(System.out::println);
        System.out.println("Formatted** ");
        // var l4 =
        l3.stream()
                .flatMap(l -> l.stream()
                        .map(s -> s.name))
                .forEach(System.out::println);


        l3.stream()
                .flatMap(l -> l.stream()
                        .map(s -> s.name))
                .max(String::compareTo)
        ;


        // System.out.println(l4);


    }

    private static void mapMethod() {
    }

    private static void flatMapMethod2() {
    }

}
