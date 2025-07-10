package com.Java8StreamLambdaFuncInterfaceMethodRef;


import java.util.LinkedList;
import java.util.List;

// Lambda expressions,
public class _1Java8Features {

    //Functional interfaces
    /*Single Abstract Method */


// Supplier, Consumer, predicate , Function


    /*Lambda expressions */
    // () ->

    // Method references,

    //Default methods,

    // Static methods in interface

    //Optional class

    //ForEach() method,

    //Stream API

    //Collectors class,


    //Parallel Array Sorting

    //Concurrency Enhancements

    // JDBC Enhancements

    //Security Enhancements

    // Memory Enhancements Garbage Collectors

    // Date Time Api

    //String Joiner
    public static List<Student> getStudentList() {
        List<Student> list = new LinkedList<>();
        list.add(new Student(4, "Sachin", "Phy", 50));
        list.add(new Student(2, "Rahul", "Chem", 53));
        list.add(new Student(1, "Amita", "Arts", 22));
        list.add(new Student(3, "Yatin", "Math", 73));
        list.add(new Student(4, "Puneet", "Eco", 14));
        list.add(new Student(6, "Pooja", "Arts", 82));
        list.add(new Student(8, "Manish", "Math", 12));
        return list;
    }

}

record Student(int roll,
               String name,
               String dept,
               int marks) {}


class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
/*
* Stream Api
* parellelstream
* of
* builder
* empty()
* generate
*
* map,mapToDouble,mapToInt
* filter
* flatmap
* distinct
* limit
* sorted(Comparator)
* skip
*
*
* count
* max/min
* forEach
* forEachOrdered
* reduce
* collect
* anyMatch
* allMatch
* noneMatch
* findAny
* findFirst
*
* */

/*state vs stateless
* */