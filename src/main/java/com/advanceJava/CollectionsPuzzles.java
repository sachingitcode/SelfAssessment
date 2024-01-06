package com.advanceJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Optional;

public class CollectionsPuzzles {

    public static void main(String[] args) {
        arraysAsList();
    }

    static void arraysAsList() {

        String[] strArr = { "one", "two", "three" };
        int[] intArr = { 1, 2, 3 };
        Integer[] integerArr = { 11, 22, 33, }; // It automatically removes ','

        var strList = Arrays.asList(strArr);
        var intList = Arrays.asList(intArr);
        var integerList = Arrays.asList(integerArr);
        System.out.println(strList.contains("one"));
        System.out.println(intList.contains(1));
        System.out.println(integerList.contains(11));
        System.out.println(intList);
        System.out.println(integerList);

        String strToCheck = checkNullEmptyBlank(null) ;
        String name = "";

        if (  Optional.ofNullable(strToCheck).isPresent() ) {
            name = "NULL";
        }  else if (strToCheck == null) {
            name = "EMPTY";
        } else if (strToCheck.isEmpty()) {
            name = "EMPTY";
        } else if (strToCheck.isBlank()) {
            name = "BLANK";
        } else {
             name = "neither NULL, EMPTY nor BLANK";
        }

        System.out.println(""+name);

    }

    public static String checkNullEmptyBlank(String strToCheck) {
        // check whether the given string is null or not
        if (strToCheck == null) {
            return "NULL";
        }
        // check whether the given string is empty or not
        else if (strToCheck.isEmpty()) {
            return "EMPTY";
        }
        // check whether the given string is blank or not
        else if (strToCheck.isBlank()) {
            return "BLANK";
        } else {
            return "neither NULL, EMPTY nor BLANK";
        }
    }

}