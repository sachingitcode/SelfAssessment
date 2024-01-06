package com.advanceJava;

/* It provides a clear and concise way to represent one method interface using an expression.
 It is very useful in collection library. 
It helps to iterate, filter and extract data from collection

Java lambda expression is treated as a function, 
so compiler does not create .class file.
 * 
 */

/*
* Note : when we implement direct interface, child directly implements the interfce method
*  Here we call interface Method, inside a new Method of child class.
* interface method is called inside some method of child class
*  */


interface Drawing{  
    public void draw();  
}  
public class LambdaExpression1 {  

    // public void draw(int width){System.out.println("Drawing "+width);}
    public static void main(String[] args) {  
        int width=1090;
        Drawing d2=()-> {   
            System.out.println("Drawing has Width : "+width);  
        };  
        d2.draw();
        // Drawing d=new LambdaExpression1()::draw;
        // d.draw(width);

    }
}  

