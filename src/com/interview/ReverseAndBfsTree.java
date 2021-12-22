package com.interview;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAndBfsTree {
    public static void main(String[] args) {
        // 1, 2, 3 4 5 6 7
        // 1 3 2
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printReversedTree(root);
    }

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static void printReversedTree(Node root){
        reverseTree(root);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    private static void reverseTree(Node root){
        while(root.left != null || root.right != null){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            root = root.left;
        }
    }
}
