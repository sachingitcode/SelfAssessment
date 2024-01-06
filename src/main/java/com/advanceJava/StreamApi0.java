package com.advanceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//  list.parallelStream().   used in multithreading ( creates many threads )
public class StreamApi0 {

    public static void main(String[] args) {

        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .map(element -> element.compareTo(15))
                .forEach(System.out::println);

        Map<String, Integer> map = Map.of("Sachin", 2, "Amit", 8, "sumit", 5, "Rahul ", 4);
        System.out.println("Getting map values in Sorted order");
        for (Integer i : map.values().stream().sorted().collect(Collectors.toList())) {
            System.out.println(i);
            // map.entrySet().forEach( j -> j.getValue().equals(i) )
        }
        map.values().stream().sorted().forEach(System.out::println);


        System.out.println("Getting Even Numbers");
        List<Integer> a1 = List.of(3, 5, 2, 6, 33, 24, 5);
        Stream<Integer> stream = a1.stream();
        List<Integer> list = stream
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list);

        stream.collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Product> productsList = new ArrayList<Product>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));

        productsList.stream()
                .filter(product -> product.price == 30000)
                .map(product -> product.price)                // How map works ;; Onces Map is Their than on that Stream only things provided in Map remains ; Whole Stream shrinks to things provided in map  ;
                // Here stream in now only have 'name' in it
                .forEach(product -> System.out.println("+++" + product));
        //          .max();
    }
}


