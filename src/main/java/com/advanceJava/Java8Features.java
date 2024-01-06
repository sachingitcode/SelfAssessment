package com.advanceJava;

import java.util.Iterator;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.BiFunction;

/* Search  ' Fantastic ' in code to get main features */
public class Java8Features {
}

/* Fantastic
 * @FunctionalInterface : Single Abstract Method though
 * It can contain any number of Object class methods.
 */
interface FunctionalInterface {
    void abstractMethod(String name, Integer marks);
}

interface Calculator {
    int inps(int a, int b);
}

class FuncInterfaceImpl implements FunctionalInterface {
    public void abstractMethod(String name, Integer marks) {
        System.out.println(name + " has " + marks + " marks");
    }
}

class CallFuncInterface {
    public static void main(String[] args) {
        FuncInterfaceImpl jc = new FuncInterfaceImpl();
        jc.abstractMethod("Sachin", 10);
    }
}

// without lambda, FunctionalInterface implementation using anonymous class
class FuncInterfaceImplWithoutLambda {
    FunctionalInterface fn = new FunctionalInterface() {
        public void abstractMethod(String name, Integer marks) {
            System.out.println(name + " has " + marks + " marks");
        }
    };
}

class FuncInterfaceViaLambda {
    FunctionalInterface fnc = (name, marks) -> System.out.println(name + " has " + marks + " marks");

    public static void main(String[] args) {
        FunctionalInterface func = (name, marks) -> System.out.println(name + " has " + marks + " marks");

        func.abstractMethod("Amit", 10);

        Calculator add = (a, b) -> (a + b);
        System.out.println(add.inps(50, 30));

        Calculator sub = (a, b) -> (a - b);
        System.out.println(sub.inps(50, 30));

    }
}

// Runnable interface has a method  run()
class ThreadWithLambda{
public static void main(String[] args) {

    Runnable thread =()->System.out.println("Thread Started");
    thread.run();
    System.out.println("Program End");
}
}



/*    Fantastic   
   MethodReference
 * It is just as Lambda ; We just need to convert Lambda Expression in a method
 * 
 */
class MethodReference {
    static int adder(int a, int b) {
        return a + b;
    }
    int subtract (int a,int b) {
         return a-b;
    }
    public static void main(String[] args) {
        Calculator add = (a, b) -> (a + b); // Lambda Expression
        add.inps(10, 70);
        // TO convert Make a method which takes 2 args and to a+b ;
        Calculator adds = MethodReference::adder;
        adds.inps(80, 90);


     /*We have same predefined functional interface to refer methods
      * We dont have to make Functional Interface, as Java Provides some of them 
      */
         // Here we Dont call  Calculator Interface as we have BiFunction same as Calculator
      BiFunction<Integer , Integer , Integer> sum = MethodReference::adder;
      int result = sum.apply(170, 120);
      System.out.println(":: "+result);

      // For instance Method , Create obj of class  
      //It is anonymous object   
      BiFunction<Integer , Integer , Integer> sub =new MethodReference()::subtract;
      int result2 = sub.apply(170, 120);
      System.out.println(":: "+result2);
 }

}
// Method Reference of  Constructor
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
 class ConstructorReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}  

/* Fantastic
 * Optional Class : for Nullpointer handling ;;; 2 main methods 
 *  To Check  :: Optional.ofNullable(str).isPresent() ;   ->  return boolean
 *  orElse    :: Optional.ofNullable(str).orElse("Not Available") ; 
 */

 class OptionalClass{
    public static void main(String[] args) {
        int []arr = new int[5];  // By default its value is 0 for each place 
        System.out.println("Present :: "+  Optional.ofNullable(arr[1]).isPresent() + " "+ arr[2]);

        String [] str = new String[5];
       System.out.println("OfNullable isPresent :: "+  Optional.ofNullable(str[1]).isPresent());
       System.out.println("OfNullable isEmpty :: "  +  Optional.ofNullable(str[1]).isEmpty());

       str[1]="Available";
       System.out.println("OfNullable isPresent :: "+  Optional.ofNullable(str[1]).isPresent());
       System.out.println("Get the Value :: "+  Optional.ofNullable(str[1]).get());  // not to use,Instead use orElse

       System.out.println("Get the Value :: "+  Optional.ofNullable(str[1]).orElse("Not Avail"));
       System.out.println("Get the Value :: "+  Optional.ofNullable(str[2]).orElse("Not Present"));

    }
 }

 /* Fantastic
  * ForEach 
  */
  class ForEachExample {  
    public static void main(String[] args) {  
        CollectionUtils.sampleList().forEach(System.out::println); 
        System.out.println("ForEachExample.main()");  
        CollectionUtils.sampleList().forEach(smple -> System.out.println(smple));

        Iterator<String> iterator = CollectionUtils.sampleList().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // After JDK 8 
        iterator.forEachRemaining( (listValue) -> System.out.println(listValue) );

    }  
}  


/* Fantastic
 * static / Default Method in Interface 
 * (  abstract method :: method which has a body  )
 * a non-abstract method inside a Interface is possible if that method is default/ static 
 * 
 *  Note you can create constructor in the abstract class whereas you can't do this in interface.
 */
interface Saying{    
    default void says(){      // default method 
        System.out.println("Hello, this is default method"); }    
      
    static void sayLoudest(String msg){     // static method   
        System.out.println(msg); }    
       
    void sayMoreThings(String msg);    // Abstract method 
}    



/* Fantastic
 * String Joiner 
 * StringJoiner( JoinerSign , prefix, suffix)
 * //  Merging two StringJoiner    // No use of 2nd Joiner's Prefix and Suffix 
*/

class StringJointers{
    public static void main(String[] args) {
        
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("Amit");
        sj.add("Rahul");
        System.out.println(" :-> " + sj);

        StringJoiner joinNames2 = new StringJoiner(":", "{", "}"); // passing colon(:) and square-brackets as delimiter
        joinNames2.add("Peter");
        joinNames2.add("Raheem");
        System.out.println(" :-> " + joinNames2);

        // Merging two StringJoiner
        StringJoiner merge = sj.merge(joinNames2);
        System.out.println(merge);
    }
}
