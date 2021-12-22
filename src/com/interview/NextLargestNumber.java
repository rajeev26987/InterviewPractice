package com.interview;

import java.util.Arrays;
import java.util.Stack;

public class NextLargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {13, 7, 6, 12};
        nextLargestNumber_O_N2(arr);
        nextLargestNumber_O_N(arr);
    }
    private static void nextLargestNumber_O_N2(int[] arr){
        int nxt = -1;
        int[] result = new int[arr.length];
        for(int i = 0; i< arr.length; i++) {
            nxt = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nxt = arr[j];
                    break;
                }
            }
            result[i] = nxt;
        }
        System.out.println(Arrays.toString(result));

    }

    private static void nextLargestNumber_O_N(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() < arr[i]){
                    stack.pop();
                }
            }
            result[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
