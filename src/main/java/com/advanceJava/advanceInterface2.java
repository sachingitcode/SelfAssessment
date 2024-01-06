package com.advanceJava;

/*         It is   a functionInterface where only 1 method is abtract  
     *  note  Single Abstract Method    (SAM) is important.
      but we can have  a interface without  abtract method. 
          java 8 can have a  body of inteface with static keyword
         it makes the interface  partially  abstract  
         and other are   non-abstract ie default and static   */

interface Drawable {
    // void draw();
    static int cube(int x) {
        return x * x * x;
    }
}

class Cube implements Drawable {
    public void draw() {
        System.out.println("drawing Cube");
    }
}

public class advanceInterface2 {
    public static void main(String args[]) {
        new Cube().draw();
        // Drawable d=new Rectangle();
        // d.draw();
        System.out.println(Drawable.cube(3));
    }
}
