package com.coreJava;


import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  

/*
Java introduced try-with-resource feature in Java 7 
that helps to close resource automatically after being used.

In other words, we can say that we don't need to close resources
 (file, connection, network etc) explicitly,
  try-with-resource close that automatically by using AutoClosable interface. 
  
  Here We Need Not to close FileStream as it automatically close  by using AutoClosable interface. 
  It calls the close() method of the Resource 
  */

  

public class TryWithResource {  
    public static void main(String[] args) throws FileNotFoundException {  
        try(FileOutputStream fileStream=new FileOutputStream("NewFile.txt");){  
             String greeting = "Welcome to Java World.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }

        try ( Resource rsc = new Resource(); ){
            rsc.operation1();
            rsc.operation2();
        }
    }  
}   
 // we can create our own resource  
// implements AutoCloseable and Override Close method 
  class Resource implements AutoCloseable{
    public Resource(){System.out.println("Resource Created");};
    public Resource operation1(){System.out.println("Operation 1"); return this;};
    public Resource operation2(){System.out.println("Operation 2"); return this;};
    public  void close (){
        System.out.println("Resource Closed");
    }
  }