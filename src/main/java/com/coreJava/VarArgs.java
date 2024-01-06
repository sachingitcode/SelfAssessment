package com.coreJava;

public class VarArgs {
    
/*
 * From JDK 5 onwards, we can declare a method with a variable number of arguments.
 * It is enhanced in Java 9 , it uses  @SafeVarargs annotation 
 */
    
 static void fun(int... a)
    {
        System.out.println("Number of arguments: "+ a.length);
    
        for (int i : a)  System.out.print(i + " ");     // using for each loop to display contents of a
        System.out.println();
    }

    public static void main(String args[])
    {
        // Calling the varargs method with different number of parameters
        fun(100);
        fun(1, 2, 3, 4);
        fun();
    }
}



