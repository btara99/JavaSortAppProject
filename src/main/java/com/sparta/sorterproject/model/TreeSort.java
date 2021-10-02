package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;


public class TreeSort implements SortManager{
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public class Tree {
        Node node;

        Tree(int value) {
            node = new Node(value);
        }

        public Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            // Move to the left if passed value is
            // less than the current node
            if (value < node.value) {
                node.left = insert(node.left, value);
            }
            // Move to the right if passed value is
            // greater than the current node
            else if (value > node.value) {
                node.right = insert(node.right, value);
            }
            return node;
        }

        // For traversing in order
        public void inOrder(Node node) {

            if (node != null ) {
                inOrder(node.left);
                if(node.value != -1){
                    System.out.print(node.value + ", ");
                }
                inOrder(node.right);
            }
        }

    }
    @Override
    public void displaySortedArr() {
        //DISPLAY AND LOG THE SORTED ARRAY
        int [] dummyArr = {-1};
        double startTime = System.nanoTime();
        Tree tree = new Tree(dummyArr[0]);
        for (int num : displayData.displayArray()) {
            tree.insert(tree.node, num);
        }
        System.out.print("The sorted array using Tree sort: [ ");
        tree.inOrder(tree.node);
        double elapsedTime = (System.nanoTime() - startTime) / 1000000000;
        System.out.print("]"+"\n" + "The time taken for Tree sort: " + elapsedTime + " Seconds");
        loggingData.timeLog(elapsedTime);

    }



}
