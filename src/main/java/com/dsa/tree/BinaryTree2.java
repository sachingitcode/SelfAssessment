package com.dsa.tree;


public class BinaryTree2 {
    static Node root;

   public static void main(String[] args) {
       add(6);
       add(4);
       add(7);
       add(8);
       add(5);
       add(3);
       add(1);
       add(2);
   }

    public static void add(int value) {
        root = createTree(root, value);
    }

    // It is a Balanced Binary Tree where left Size is less and right is more than node
    static Node createTree(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = createTree(current.left, value);
        } else if (value > current.value) {
            current.right = createTree(current.right, value);
        } else {
            return current; // value already exists
        }
        return current;
    }
}
