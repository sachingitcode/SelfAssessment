package com.advanceJava;

interface  FuncIntrWithMultParam{
    int add (int a , int b );
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        // now we implement add() using ->
        int v1 = 50,v2 = 30;
      FuncIntrWithMultParam ad1 = (a,b) -> (a+b);
      System.out.println(    ad1.add(v1,v2)  );

      

    } 
    
}
