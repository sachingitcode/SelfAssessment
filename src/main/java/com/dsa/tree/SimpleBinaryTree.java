package com.dsa.tree;

// Also gives us sorting
public class SimpleBinaryTree {
    public static void main(String[] args) {
        BTreeImpl bt = new BTreeImpl();
        bt.add(30);
        bt.add(50);
        bt.add(10);
        bt.add(40);
        bt.add(60);
        bt.add(20);
        bt.add(80);
        bt.display();
    }
}


class BTreeImpl {
    Node root;

    public void add(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        if (root == null)
            root = new Node(data);// root
        else if (data < root.value)
            root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public void display() {
        inOrder(root);
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }
}

//class Node {
//    Node left;
//    Node right;
//    int data;
//    public Node(int data) {
//        this.data = data;
//    }
//}