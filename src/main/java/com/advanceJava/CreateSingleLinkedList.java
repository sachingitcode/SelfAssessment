/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.advanceJava;

/**
 *
 * @author sachinyadav
 */
public class CreateSingleLinkedList {

    class Node {

        int i;
        Node next;
        Node previous;

        public Node(int i) {
            this.i = i;
        }
    }

    Node head, tail = null;

    void addNode(int i) {

        Node newNode = new Node(i);
        if (head == null) {
            head = tail = newNode;
            head.previous = tail.next = null;  //??

        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;

        }
    }

    void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        while (current != null) {
            System.out.println("" + current.i);
            current = current.next;

        }

    }

    
    public static void main(String[] args) {  
        //create a DoublyLinkedList object
        CreateSingleLinkedList dl_List = new CreateSingleLinkedList();  
        //Add nodes to the list  
        dl_List.addNode(10);  
        dl_List.addNode(20);  
        dl_List.addNode(30);  
        dl_List.addNode(40);  
        dl_List.addNode(50);  
   
        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();  
    } 
    
}