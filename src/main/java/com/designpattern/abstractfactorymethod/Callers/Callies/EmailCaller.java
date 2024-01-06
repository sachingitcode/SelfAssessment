package com.designpattern.abstractfactorymethod.Callers.Callies;

public class EmailCaller implements Caller {
    @Override
    public void callUser() {
        System.out.println("Caller details by Email");
    }
}