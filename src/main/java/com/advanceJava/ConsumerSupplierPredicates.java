package com.advanceJava;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerSupplierPredicates {

    /* These are special type of Functional Interfaces which helps in lambda expression  */


    /*   Supplier Doesn't take a input  and provides output
      ()    -------------->              returns value
    *It has .get() method to call the interface
    */
    public void supplierExample() {
        Supplier<Double> randomNumber;
        randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());
    }


    /* Consumer takes a value , but returns no output
     *   (value)   -------------->      .
     *
     *It has .accept(T) method, use to provide value
     */
    public void consumerExample() {
        Consumer<String> response;
        response = (value) -> System.out.println(("Print name " + value));
        response = (value) -> newMethod(value);
        response.accept("Sachin");
    }

    public void newMethod(String s) {
        System.out.println("Print name " + s);
    }



    /* Simple function takes input and returns output
     *   (value)   -------------->    y-value
     *
     * It has .apply(T) method to call it.
     * */

    public void functionExample() {
        /// Here below It takes String as input and Integer as output
        Function<String, Integer> getStringLength;
        getStringLength = (str) -> str.length();
        getStringLength.apply("MyString");
    }


    public static void main(String[] args) {
        new ConsumerSupplierPredicates().supplierExample();
        new ConsumerSupplierPredicates().consumerExample();
    }

}
