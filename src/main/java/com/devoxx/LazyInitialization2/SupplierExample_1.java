package com.devoxx.LazyInitialization2;
import java.util.function.Supplier;


class CustomObject {

//    CustomObject (String value) {
//        System.out.println(value);
//    }

    public static String getObject(String value) {
        System.out.println("Start get Object"+ value);
        return   value+"Updated Now";
    }
}
public class SupplierExample_1 {
    public static void main(String[] args) {
        Supplier<String> customObjectSupplier = () -> CustomObject.getObject("Lazy initialization");
        System.out.println("Supplier not called yet");
          // get inits CustomObject
        System.out.println( "Response ::"+ customObjectSupplier.get());
    }
}
