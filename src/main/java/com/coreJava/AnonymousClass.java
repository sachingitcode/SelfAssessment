package com.coreJava;

import java.util.Objects;

/* It is a feature of Java 5 */

class Test {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
      Objects.equals("String 1", "String 2");
      "String A".equals("String B");


        genericDisplay(11);// Calling generic method with Integer argument
        genericDisplay("GeeksForGeeks");// Calling generic method with String argument
        genericDisplay(1.0); // Calling generic method with double argument
    }
}

abstract class ABCD<T> {
    abstract T show(T a, T b);
}

public class AnonymousClass {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
            String show(String a, String b) {
                return a + b;
            }
        };
        String result = a.show("Java", "9");
        System.out.println(result);
    }

}
