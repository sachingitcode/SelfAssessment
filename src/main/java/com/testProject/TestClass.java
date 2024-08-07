package com.testProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.HashMap;

public class TestClass {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2024-11-04 18:51:30",  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDate firstDay = localDate.with(IsoFields.DAY_OF_QUARTER, 1L);

        System.out.println("******* ..... "+ firstDay);

        HashMap<String, Boolean> map = new HashMap();
        map.put("MDR", true);
        if ( !map.containsKey("MDR") || !map.get("MDR") ) {
            System.out.println("MDR  not Avail");
        } else {
            System.out.println("MDR Avail");
        }
    }
}
