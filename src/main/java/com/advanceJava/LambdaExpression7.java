package com.advanceJava;


import java.util.ArrayList;
 import java.util.Collections;
import java.util.List;
class Products{
    int id ;
    String name ;
    int price;

    Products( int id , String name , int price){
        super();
        this.id=id;
        this.name=name;
        this.price= price;

    }

}
 
public class LambdaExpression7 {

    public static void main(String[] args) {
        List<Products> list = new ArrayList<Products>();
 
    list.add(new Products(1,"HP Laptop",25000));  
    list.add(new Products(3,"Keyboard",300));  
    list.add(new Products(2,"Dell Mouse",150)); 

 Collections.sort(list, (p,q) -> {return  p.name.compareTo(q.name); }  );
 

    list.forEach( (p) -> System.out.println(p.id+" "+p.name+" "+p.price)   );
 
 
    }

}


