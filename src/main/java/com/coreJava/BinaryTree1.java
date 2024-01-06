package com.coreJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*  Binary Tree is  a recursive data structure 
where each node can have '2 children at most'
Max no of nodes at level i is 2^i 
To create a Binary tree : we need a class 'Node' it has 1 left Node and 1 right Node
and to put values in that node , it has a variable  ie 'value'

    1 
   / \
  2   3
 /   / \
4   5   6
   / \
  7   8
 */


class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}


public class BinaryTree1 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
      Node tree=  createTree();
      System.out.println("");
      inOrder(tree);
      System.out.println("");
      preOrder(tree);
      System.out.println("");
      postOrder(tree);
      System.out.println("");
      printTree(tree); 
    }

/*Only Left and Right nodes to be filled  First every Right Node is Filled.
 once once -1 is entered i.e no Child Node is their 
 so it will fill the Node and then move back to its parent node  */

    static Node createTree() {
        Node root = null;
        System.out.println("Enter Value: ");
        int value = sc.nextInt();
        if (value == -1) return null;

        root = new Node(value);

        System.out.println("Enter value for  Left  " + value);
        root.left = createTree();

        System.out.println("Enter value for Right  " + value);
        root.right = createTree();

        return root;
    }

    // Left ->Node ->  Right
    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        visit(root.value);
        inOrder(root.right);
    }

    // Node -> Left -> Right
    static void preOrder(Node root) {
        if (root == null) return;
        visit(root.value); //System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

      // Left -> Right -> Node
      static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        visit(root.value);
    }

    private static void visit(int value) {
        System.out.print(" " + value);        
    }


     // Java Printing a Binary Tree using Level-Order in a Specific Format
    public static void printTree(Node root) {
        Queue<Node> level  = new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()){
            Node node = level.poll();
            System.out.print(node.value + " ");
            if(node.left!= null)
            level.add(node.left);
            if(node.right!= null)
            level.add(node.right);
        }
        System.out.println(" ");
    }




}



/*For Refrence Check youtube 'Anuj Bhaiya' 'Binary Tree Data Structure | Implementation of a Binary Tree'  */
