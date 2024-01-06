package com.coreJava;

interface shape {
    String shapeDetails();
}

class rect implements shape {
    public String shapeDetails() {
        return "rectangle";
    }
}

class circle implements shape {
    public String shapeDetails() {
        return "circle";
    }
}

class square {
    public String shapeDetails() {
        return " square ";
    }

}

public class SimpleInterface2 {
    public static void main(String[] args) {

        rect a = new rect();
        System.out.println(a.shapeDetails());

        square s = new square();
        System.out.println(s.shapeDetails());
    }
}
