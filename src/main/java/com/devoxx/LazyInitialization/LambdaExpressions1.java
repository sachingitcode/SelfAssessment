package com.devoxx.LazyInitialization;

/*Level of InDirection Solves the Majority of Problems in Computer Programming
 * In Procedural Code, Pointer gives the power Of Indirection
 * In OO code, Overriding gives the Power
 * In Functional Programming Lambda gives the power
 */

public class LambdaExpressions1 {


    public static void main(String[] args) {
        int value = 4;
        int temp = compute(value);
       if (value > 4 && temp > 100) {    // Here It is Eager initialization . Here Compute is Called, though it is not needed.
           System.out.println("Part 1 with " + temp);
        } else {
            System.out.println("Part 2 ");
        }

      
        // Here It is Lazy initialization . Here Compute is Called, When it is needed.
        // i.e compute Here is Not called. It is Called With temp1.get()
        Lazy <Integer>  temp1 = new Lazy(()-> compute(value));
        System.out.println("Calling Compute Now via get()");   
        /* Here we can not change the variable value ie ( value = xyz cannot be possible) as 
         * Local variable value defined in an enclosing scope must be final or effectively final */
        // value = 5;

         if (value > 4 && temp1.get() > 100) {
            System.out.println("Part 1 with " + temp1);
        } else {
            System.out.println("Part 2 ");
        }
    }


    private static int compute(int value) {
        System.out.println("Compute Called with value:"+ value);
        return value * 100;
    }
}
