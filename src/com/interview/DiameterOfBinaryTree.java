package com.interview;

import java.util.ArrayList;
import java.util.List;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Node root = insert(100);
        root.left = insert(20);
        root.right = insert(130);
        root.left.left = insert(10);
        root.left.right = insert(50);
        root.right.left = insert(110);
        root.right.right = insert(140);
        root.left.left.left = insert(5);

        System.out.println(findLongest(root));
    }

    static class Node{
        Node left;
        Node right;
        int data;
    }

    static Node insert(int data){
        Node n = new Node();
        n.data = data;
        n.left = null;
        n.right = null;
        return n;
    }

    static List<Integer> findLongest(Node root){
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> leftIterations = findLongest(root.left);
        List<Integer> rightIterations = findLongest(root.right);

        if(rightIterations.size() > leftIterations.size())
            rightIterations.add(root.data);
        else leftIterations.add(root.data);

        return rightIterations.size() > leftIterations.size() ? rightIterations : leftIterations;
    }
}
