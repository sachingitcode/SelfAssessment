package com.designpattern.abstractfactorymethod.Callers.Callies;

public class SMSCaller implements Caller {
    @Override
    public void callUser() {
        System.out.println("Caller details by SMS");
    }
}

