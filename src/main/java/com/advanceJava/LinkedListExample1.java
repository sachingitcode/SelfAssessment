/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.advanceJava;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;


/**
 *
 *   Linked list  :
 * @author sachinyadav
 */

 

public class LinkedListExample1 {

    public static void main(String[] args) {

    List<Student> list = CollectionUtils.getStudentList();

    Stream.Builder<List<Student>> builder = Stream.builder();

    Stream<List<Student>> stream = builder.add(list).build();

    stream.forEach(System.out::println);
       //  .collect(Collectors.toList());

        // Displaying the elements in list
        System.out.println(list.get(0).name);
  
        LinkedList<String> list2=new LinkedList<String>();  
           list2.add("Ravi");  
           list2.add("Vijay");  
           list2.add("Ajay");  
           //Traversing the list of elements in reverse order  

           Iterator<String> itr= list2.descendingIterator();  
           while(itr.hasNext())  
           {  
               System.out.println(itr.next());  
           }  
             
    }

}
