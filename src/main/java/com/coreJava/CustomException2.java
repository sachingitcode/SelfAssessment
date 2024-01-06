package com.coreJava;

/*
 * Create a Custom class Extending Exception
 * Call the Paramterized Constructor with super
 */

public class CustomException2 {

    public static void main(String[] args) {
        try { 
        } catch (Exception ex) {
            System.out.println("Exception occured: " + ex);
        }

        try{}finally{}    // try with finally can work

        try{}catch(Exception e){}  // try with catch can work

        // try{}     simple try cannot work
        // catch(Exception e){} finally{}    cannnot work

      finally{}  // simple finally  can work 


    }
}
