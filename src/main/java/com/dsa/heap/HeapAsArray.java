package com.dsa.heap;

/* Heap : it is a Complete binary Tree + childs are always either greater or smaller. It can not be both in 1 tree.
*  Binary Tree : having at most 2 children (right /left)
*  Complete Binary Tree : 1. Tree having its left children always filled
*     2. while representing binary tree in listay. no blank sholud be present in elements.
* Heap --- Com Binary Tree, with nodes(child / parent) located in a manner of either childs are greater than parent or less than parent.
*  1 MAX Heap : Here Parent is greater than all child
*  2 Min Heap : Here Childs are graeter than parent
    1
   / \
  2   3
 / \  / \
4   5 6  7
listay [1,2,3,4,5,6,7]

    1
   / \
  2   3
 / \
4   5
listay [1,2,3,4,5]


*
*
* */

import java.util.ArrayList;
import java.util.List;


public class HeapAsArray {

    public static void main(String[] args) {
        startHeap();
    }

    public static void startHeap() {

        List<Integer> list = new ArrayList<>();
        insertInList(list, 3);
        insertInList(list, 4);
        insertInList(list, 2);
        insertInList(list, 5);
        insertInList(list, 1);
        insertInList(list, 7);
        insertInList(list, 6);
        insertInList(list, 8);

        System.out.println("^^^^^^^^^^^^^  LIST  " + list);

        //   printTreeArray(list);
        deleteFromList(list);
        deleteFromList(list);
        deleteFromList(list);
        deleteFromList(list);
        // insert at last position , check its parent if parent is bigger, swap with parent

    }

    private static void deleteFromList(List<Integer> list) {
        deleteFromRoot(list);
        moveLastEleToRoot(list);
        rearrangerList(list);
    }

    private static void rearrangerList(List<Integer> list) {
        compareChildAndGetGreaterChild(list);
    }

    private static void compareChildAndGetGreaterChild(List<Integer> list) {

        int i = 0;
        while (leftIndex(list, i) < list.size() - 1) {
            if (leftIndexValue(list, i) > rightIndexValue(list, i)) {
                if (list.get(i) < leftIndexValue(list, i)) {
                    var replaceVal = list.set(i, leftIndexValue(list, i));                     // swap
                    list.set(leftIndex(list, i), replaceVal);
                    i = leftIndex(list, i);
                }
            } else {
                if (list.get(i) < rightIndexValue(list, i)) {
                    var replaceVal = list.set(i, rightIndexValue(list, i));                     // swap
                    list.set(rightIndex(list, i), replaceVal);
                    i = rightIndex(list, i);
                }
            }
        }
    }

    private static void moveLastEleToRoot(List<Integer> list) {
        list.set(0, list.getLast());
        list.removeLast();
    }

    private static void deleteFromRoot(List<Integer> list) {
        System.out.println("Item to Remove ##########  " + list.getFirst());
    }


    private static void insertInList(List<Integer> list, int ele) {
        if (list.isEmpty()) {
            list.add(ele);
        } else {
            checkParentAndSwap(list, ele);
        }
    }

    // list set (position , element );// it returns value of last replaced element.if 40 is being replaced by 60,then set() returns 40
    public static void checkParentAndSwap(List<Integer> list, int ele) {
        int i = list.size();
        list.add(ele);
        while (i > 0) {
            var parent = parentIndexValue(list, i); // 40
            if (ele > parent) {  // swap
                list.set(parentIndex(i), ele);
                list.set(i, parent);
                i = parentIndex(i);
            } else {
                break;
            }
        }
    }


    public static int leftIndex(List<Integer> list, int i) {
        return (2 * i) + 1;
    }

    public static int leftIndexValue(List<Integer> list, int i) {
        return list.get((2 * i) + 1);
    }

    public static int rightIndex(List<Integer> list, int i) {
        return (2 * i) + 2;
    }

    public static int rightIndexValue(List<Integer> list, int i) {
        return list.get((2 * i) + 2);
    }

    public static int parentIndex(int i) {
        return Math.ceilDiv(i, 2) - 1;
    }

    public static int parentIndexValue(List<Integer> list, int i) {
        var v = Math.ceilDiv(i, 2) - 1;
        return list.get(v);
    }


    static int PowerOf2(int power) {
        return (1 << power);
    }

    static void printTreeArray(List<Integer> list) {
        int arrayLength = list.size();
        int currentLevel = 0;
        int maxPerLevel = PowerOf2(currentLevel);
        for (int i = 0; i < arrayLength; i++) {
            if (i == maxPerLevel - 1) {
                System.out.println("\n");
                currentLevel++;
                maxPerLevel = PowerOf2(currentLevel);
            }
            System.out.print(" " + list.get(i));
        }
    }


}
