package com.Java8StreamLambdaFuncInterfaceMethodRef;

interface aI {
    public int func(String a, String b);

    // It can have default func
    default int func(String a) {
        return a.length();
    }
}

/*
 * Step 1 : Do not implement interface
 * Step 2 : Call interface name with return type  aI(a) =
 * Step 3 : take args  (a , b )
 * Step 4 : defination of that absratct method
 * Step 5 : call that method
 */

interface bI {
    public int operation(int a, int b);
}


public class FunctionalInterface1 {
    public static void main(String[] args) {

        /* Both are same  ainterface and ainterface2 */
        aI ainterface = (b, c) -> {
            return b.length() + c.length();
        };

        aI ainterface2 = (b, c) -> b.length() + c.length();

        int count = ainterface.func("abc", "xyz");
        int count2 = ainterface2.func("abcd", "wxyz");

        System.out.println(count);
        System.out.println(count2);

        /* ************ */

        bI add = (l, m) -> l + m;
        bI mul = (l, m) -> l * m;

    }
}
