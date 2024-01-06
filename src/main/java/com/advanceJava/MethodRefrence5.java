package com.advanceJava;

interface Messageable1{  
    Message1 getMessage(String msg);  
}  
class Message1{     //  here reference of contructor 
    Message1(String msg){  
        System.out.print(msg);  
    }  
}  
public class MethodRefrence5 {  
    public static void main(String[] args) {  
        Messageable1 hello = Message1::new;  
        hello.getMessage("Hello");  
    }  
}  