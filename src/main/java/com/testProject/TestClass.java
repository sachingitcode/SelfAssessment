package com.testProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class TestClass {



    
    void samplemethod() {
        LocalDate localDate = LocalDate.parse("2024-11-04 18:51:30",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDate firstDay = localDate.with(IsoFields.DAY_OF_QUARTER, 1L);

        System.out.println("******* ..... " + firstDay);

        HashMap<String, Boolean> map = new HashMap();
        map.put("MDR", true);
        if (!map.containsKey("MDR") || !map.get("MDR")) {
            System.out.println("MDR  not Avail");
        } else {
            System.out.println("MDR Avail");
        }
    }

    public static void main(String[] args) {
        var t = "1234";
        String arr[] = { "javaasd", "javaqwe", "jav", "javava" };
        char[] c = t.toCharArray();
        System.out.println(c[2]);
        System.out.println(t.charAt(3));
        Arrays.asList(arr);
        array_1();
    }

    // Given an array and a target sum, return the indices of the two numbers that
    // add up to it.
    static void array_1() {
        int target = 9;
        int ar[] = { 6, 3, 4, 2, 7, 6, 8 };
        Map map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int comp = target - ar[i];
            if (map.containsKey(comp)) {
                System.out.println(map.get(comp) + " " + i);
            }

        }

        int length = ar.length;
        int i = 0;

        for (int j = 0; j < ar.length; j++) {
            for (int j2 = 0; j2 < ar.length; j2++) {

            }

        }

        while (i < length) {

        }

    }

}
