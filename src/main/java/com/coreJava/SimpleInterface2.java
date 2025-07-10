package com.coreJava;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

@FunctionalInterface
interface Shape {
    String shapeDetails();
}

class Rect implements Shape {

    // Shape s = () -> { return "Rectangle Shape";};
    Shape s = () -> "Rectangle Shape";    // Both are same

    public String shapeDetails() {
        return "rectangle";
    }
}

class Circle implements Shape {
    Shape s = () -> "Circle Shape";

    public String shapeDetails() {
        return "circle";
    }
}

class Square {
    Shape sq = () -> "Square Shape";


    public String shapeDetails() {
        return " square ";
    }

}

public class SimpleInterface2 {
    public static void main(String[] args) {

        Rect a = new Rect();
        System.out.println(a.shapeDetails());

        Square s = new Square();
        System.out.println(s.shapeDetails());

        Predicate<String> p = (str) -> str.length() > 5;  //   (a) -> a.length() > 5 ? true : false;
        boolean pTest = p.test("Hello123");


        BiConsumer<String, Integer> biC = (str1, int1) -> System.out.println(str1 + " " + int1);


        BiFunction<String, String, Integer> biF = (str1, str2) -> (str1 + str2).length();

        //We can Create our default Functions like that
    }
}
