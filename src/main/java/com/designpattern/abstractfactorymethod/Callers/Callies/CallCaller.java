package com.designpattern.abstractfactorymethod.Callers.Callies;

public class CallCaller implements Caller {
    @Override
    public void callUser() {
        System.out.println("Caller details by Call");
    }
}