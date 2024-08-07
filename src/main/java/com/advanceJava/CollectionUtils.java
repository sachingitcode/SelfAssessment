package com.advanceJava;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CollectionUtils {

    /*
     * Indroduced in Java 9 ,
     * List.of() , Map.Of() are static factory methods for List, Set and Map
     * These methods are useful to create small number of collection.
     */
    public static List<String> sampleList() {
        List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP" , "Spring" , "JSP", "Spring", "JDBC");
        return list;
    }

    public static Map<Integer, String> sampleMap() {
        return Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
    }

    public static List<Student> getStudentList() {
        List<Student> list = new LinkedList<>();
        list.add(new Student(4, "Sachin", "Phy", 50));
        list.add(new Student(2, "Rahul", "Chem", 53));
        list.add(new Student(1, "Amita", "Arts", 22));
        list.add(new Student(3, "Yatin", "Math", 73));
        list.add(new Student(4, "Puneet", "Eco", 14));
        list.add(new Student(6, "Pooja", "Mech", 82));
        list.add(new Student(8, "Manish", "Comp", 12));

        return list;
    }

    public static Map<Integer, Book>  getBookMap() {
        Map<Integer, Book> map = new HashMap<Integer, Book>();

        map.put(1, new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 80));
        map.put(2, new Book(152, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 14));
        map.put(3, new Book(103, "Operating System", "Galvin", "Wiley", 56));

        map.put(11, new Book(301, "Let us C ++", "Yashwant", "BPTP", 8));
        map.put(21, new Book(142, "Networking", "Forouzan", "Mc Hill", 45));
        map.put(31, new Book(703, " System Analysis", "Galvin", "Wiley", 56));

        map.put(45, new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8));
        map.put(62, new Book(852, "Data Communications", "Forouzan", "Mc Graw Hill", 14));

        return map;

    }

    public static Stack<String> getStringStack() {
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.push("Sachin");
        stack.push("Garnav");
        stack.push("Amita");
        stack.push("Ashmeet");
        stack.push("Gurim");
        return stack;
    }

    public static int[] getIntArray() {
        int[] a = { 72, 11, 44, 19, 43, 46, 37, 99, 26, 81, 35, 14, 64, 33, 63 };
        return a;
    }
}

class Student {
    int roll;
    String name;
    String dept;
    int marks;

    public Student(int roll, String name, String dept, int marks) {
        this.roll = roll;
        this.name = name;
        this.dept = dept;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

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