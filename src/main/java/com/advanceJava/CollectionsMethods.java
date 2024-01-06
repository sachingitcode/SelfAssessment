package com.advanceJava;

 import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {
      List <String> lists =  CollectionUtils.sampleList();

      for(String element : lists){
        System.out.println("Value of " +element  + " : " +  Collections.frequency(lists, element) );
      }
      
    }

}
