package com.testProject;

import java.io.IOException;

public class SampleClass {
    public static void main(String[] args) throws IOException {
// try can work with finally
//        try {
//            System.out.println("Hello World!");
//        } finally {
//            System.out.println("Goodbye World!");
//        }

// try with resource not required catch / finally
//        try(FileReader fr = new FileReader("text.txt")){
//            System.out.println("Hello World!");
//        }
        System.out.println(testFunc());
        //   This is cool
        /* Response
                Initials Hello World!
                Finally Goodbye World!
                Try Hello World!
                 */
        //   Finally Block always execute and
        //    if return in finally block , that will return
        //    else if nothing return in finally , then try/ catch return will execute

        // But this thing not happen always


        System.out.println(testUpdateFunc());
        // when finally return is commented it returns 1 /
        // when finally return is there, it returns 2
    }

    private static int testUpdateFunc() {
        int result = 0;
        try {
            result = 1;
            return result;
        } finally {
            result = 2;
            //  return result;
        }
    }

    private static String testFunc() {
        try {
            System.out.println("Initials Hello World!");
            return "Try Hello World!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Catch Hello World!";
        } finally {
            System.out.println("Finally Goodbye");
            //  return "Finally Goodbye World!";
        }
    }

}
