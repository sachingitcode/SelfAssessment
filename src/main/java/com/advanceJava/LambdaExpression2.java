package com.advanceJava;

/**
 * here methodBody of FuncInterface is in lambda Expression 
 * provide the implementation of an interface which has functional interface
 */


interface FuncInterface {
    public String funcInterfaceMethod();
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        FuncInterface fnc = () -> {
            return " Declared in  FuncInterface and assigned here by lmbda  ";
        };
        System.out.println( fnc.funcInterfaceMethod()) ;

    }

}
