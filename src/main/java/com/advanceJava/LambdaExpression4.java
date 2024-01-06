package com.advanceJava;
import java.util.*;


public class LambdaExpression4 {
    
    public static void main(String[] args) {
         
    List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  

        list.forEach(  (n) -> System.out.println(n) );


        Map<String ,String > map = new HashMap<String ,String>();
        map.put("Name","Sachin");
        map.put("Roll", "20");
        map.put("Class", "Btech");

       map.forEach(  (k,v) ->System.out.println( k + " ,  " + v ) );

}
}