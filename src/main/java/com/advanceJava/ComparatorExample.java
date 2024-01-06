package com.advanceJava;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Student> list = fillElementInList();
        for (Student student : list) {
            System.out.println("List Name :: " + student.name);
        }

        /* Type 1 Here Call the Class (NameComparator ,DeptComparator) which is modified accordance with Comparator  */
        Collections.sort(list, new NameComparator());
        for (Student student : list) {
            System.out.println("After Name Sorting ");
            System.out.println("" + student.name + " - " + student.dept);
        }

        list.sort(new DeptComparator());
        for (Student student : list) {
            System.out.println("After Dept Sorting ");
            System.out.println(student.roll + " - " + student.name + " - " + student.dept);
        }




        // Collections.sort(newList, Collections.reverseOrder());

        Comparator <Student> cmp = Comparator.comparing(Student::getName);
        Collections.sort(list, Collections.reverseOrder(cmp));
        System.out.print(" ");
        for (Student student : list) {
           System.out.print(" " + student.name);
        }

        Collections.sort(list, Collections.reverseOrder());
        // Collections.sort(newList, new NameComparator());

        for (Student student : list) {
            System.out.println("After Then :: " + student.name);
        }
        // Collections.addAll(list, list2);
        // System.out.println(newList.toString());
        System.out.println(Collections.binarySearch(List.of("e1", "e2  ", "e3"), "one"));
        // Collections.reverse(newList);
        // System.out.println(newList);

    }


  public static  List<Student> fillElementInList (){
    List<Student> list = new LinkedList<Student>();
        list.add(new Student(4, "Sachin","Phy",50));
        list.add(new Student(2, "Rahul","Chem",53));
        list.add(new Student(1, "Amita","Arts",22));
        list.add(new Student(3, "Yatin","Math",73));
        list.add(new Student(4, "Puneet","Eco",14));
        list.add(new Student(6, "Pooja","Mech",82));
        list.add(new Student(8, "Manish","Comp",12));
        return list;
    }
}

// It is a Comparartor Class 
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return -(o1.name.compareTo(o2.name));
    }
}

class DeptComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.dept.compareTo(o2.dept));
    }
}

 