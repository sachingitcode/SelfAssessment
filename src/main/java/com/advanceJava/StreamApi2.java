package com.advanceJava;

import java.util.stream.*;

// Iterating  With Stream Api
public class StreamApi2 {
  public static void main(String[] args) {

  //  List list = 
    Stream.iterate(1, element -> element + 1)
        .filter(element -> element % 5 == 0)
        .limit(5)
        .collect(Collectors.toList());

    // .forEach(System.out::println);
    // List list =
    // Stream.iterate(1, element->element+1)
    // .filter(element->element%5==0)
    // .limit(5)
    // .collect(Collectors.toList()) ;



  }

}
