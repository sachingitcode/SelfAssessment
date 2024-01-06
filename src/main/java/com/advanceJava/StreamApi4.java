package com.advanceJava;


import java.util.List;
import java.util.Optional;


// findAny()  - return optional : defines if any value is there or not
// findFirst

// anymatch   - takes arg , return boolean , tells that condition matches with any of parameter in the list
// allmatch
public class StreamApi4 {
    public static void main(String[] args) {

        // stream of integer
        List <Integer> list= List.of(1,5,8,3,5,2,7,8,9,3);
        // .parallel();

        // defines if anyOne divided by 5
        Optional<Integer> any = list.stream().filter(p -> p % 5 == 0).findAny();

        // find the first element stisfing condition
        Optional<Integer>  first = list.stream().filter(p -> p % 50 == 0).findFirst();  // if notfound gives Optional.empty

        boolean b = list.stream().anyMatch(p -> p % 4 == 0);





        System.out.println("first: "+ first);
    }
}
