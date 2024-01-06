package com.advanceJava;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* Comparable Provides Single Sorting sequence
It is applied to the class
It has method CompareTo() which compares the Object.
 So By default Class becomes comparable acc. to that method
 It affects the original class ie original class is modified
 as Class is already sorted we can simply use  'Collections.sort(List)'  */

 // Here this class is already modified accordance wih compareTo method
 class Teacher implements Comparable<Teacher> {
    int id;
    String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Teacher o) {
        return name.compareTo(o.name);
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        List<Teacher> list = new LinkedList<Teacher>();

        list.add(new Teacher(4, "Sachin"));
        list.add(new Teacher(2, "Rahul"));
        list.add(new Teacher(1, "Amit"));
        list.add(new Teacher(3, "Yatin"));
        list.add(new Teacher(4, "Puneet"));
        list.add(new Teacher(6, "Nishant"));
        list.add(new Teacher(8, "Manish"));
       
       // Collections.sort(list);
       list.sort(Collections.reverseOrder());  // For reverse Sort
        for (Teacher teacher : list) {
            System.out.println("Teacher Name: " + teacher.name);
        }
}
}