//package com;
//
//import jakarta.transaction.Transactional;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.stream.Stream;
//
//@FunctionalInterface
//interface BiPredicate {
//    boolean predict(Integer a, Integer b);
//}
//
//@FunctionalInterface
//interface BiConsumer {
//    boolean consume(Integer a, Integer b);
//}
//
//
//public class TestClass {
//
//
//    BiPredicate p = (Integer a, Integer b) -> a + b == 9;
//
//    public static void main(String[] args) {
//
//        int t = 9;
////        var list = List.of(1, 2, 5, 7);
//
//        List list = Stream.of(1, 2, 5, 7, 8, 15)
//                .sorted()
//                .filter(n -> n < t)
//                .toList();
//
//    //    list.stream().
//
////       / list.stream()
////        stream.filter(l -> l < 10)
////                .sorted()
////                .forEachOrdered((i, j) -> {
////
////                })
////                .reduce()
////                .forEach()
//
//
//        HashSet hashSet = new HashSet();
//        hashSet.add("A");
//        hashSet.add("B");
//        hashSet.add("A");
//
//        hashSet.forEach(System.out::println);
//
////        BiPredicate<Integer,Integer> predicate = (a, b) -> a+b;
////        // Find the sum of any two number equals to target in array. {1, 2, 5, 7}, t=9 -> true
////
////        Predicate<Integer,Integer> predicate =  (a, b) -> {a+b ==9};
////
////
////        int t=9;
////        var list = List.of(1, 2, 5, 7);
////        list.stream().filter(l -> l<10)
////                .reduce()
////                .forEach(System.out::println)
//
//// java Stream api
////        SAM
////                ->
////
////                21
////        switch () ->{
//
//        }
//
//    }
//}
//
//// virtual thread
//// count down latch
//
//@Transactional
//
//@Configuration
//
//@Bean
//// Profiling
//// dev ,lab . prof
//// Table - Date
//
//// select * from table_name order by created_on desc ;
//// table emps : id name dept
////cont no of emp in each dept
//
//// select dept, count(name) from emps group by dept;
//
//// api1 api2 api3 api4 up / up desc ; serivce zuul
//// zuul discovery
//// microserv
////
//// circuit braker : any service is down ( call back  )
//// load ba
//
