package com.interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BfsInAlternateDirection {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(5);
        root.left.right = new Node(7);
        root.right.left = new Node(9);
        root.right.right = new Node(10);
        bfsAlternate(root);
    }

    private static void bfsAlternate(Node root){
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stk = new Stack<>();
        boolean stackIt = true; // this denotes we should stack the alternate level elements for printing
        int dir = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            if(root.left == null && root.right == null){
                System.out.println(root.val);
                queue.poll();
                root = queue.peek();
                continue;
            }

            if(root.left != null){
                queue.add(root.left);

            }

            if(root.right != null){
                queue.add(root.right);
            }

            Node head = queue.poll();
            System.out.println(head.val);
            root = queue.peek();
        }
    }
}
