package com.designpattern.singleton;

public class SampleClass {

    public static void main(String[] args) {
        SingletonPattern sp1 =SingletonPattern.getInstance();
        SingletonPattern sp2 =SingletonPattern.getInstance();
        SingletonPattern sp3 =SingletonPattern.getInstance();
        System.out.println("Hashcode of x is " + sp1.hashCode());
        System.out.println("Hashcode of x is " + sp2.hashCode());
        System.out.println("Hashcode of x is " + sp3.hashCode());

    }
}
