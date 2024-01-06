package com.advanceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 
public class StreamApi1 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(4, "sachin", 239.5f));
        list.add(new Product(8, "rahul", 943.8f));
        list.add(new Product(9, "jatin", 231.5f));
        list.add(new Product(2, "monty", 439.0f));
        list.add(new Product(19, "sahil", 299.6f));
        list.add(new Product(88, "rohit", 143.7f));
        list.add(new Product(99, "jonty", 291.9f));
        list.add(new Product(20, "sonu", 839.4f));

        System.out.println("Getting Product Name  having Price > 500");

        list.stream()
                .filter(product -> product.price > 500)
                .forEach(product -> System.out.println(product.name));

        System.out.println("Showing Just Price having PId > 10 ");
        List<Float> productPriceList = list.stream()
                .filter(p -> p.id > 10)
                .map(p -> p.price) // used to tell what data to show
                .collect(Collectors.toList());

        System.out.println(productPriceList);

    }
}
