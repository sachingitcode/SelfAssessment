package com.coreJava;

/*
 * Create a Custom class Extending Exception
 * Call the Paramterized Constructor with super
 */

 class InvalidAgeException extends Exception {
    public InvalidAgeException (String str){
       super(str);  
    }
}

public class CustomException1 {
 
    public static void main(String[] args) {
        try  
        {     // their should be situation which should tells: this Exception is called.
               // throw is used here (not throws)
              // If i remove this line, complier wont able to get when to call/throw InvalidAgeException
             throw  new InvalidAgeException("This is the value of ex ");
        }  
        catch (InvalidAgeException ex)  
        {    System.out.println("Exception occured: " + ex);  
        }  
  
    }
 }
 