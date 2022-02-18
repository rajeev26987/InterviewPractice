package com.interview;

public class KthMissingElement {
    public static void main(String[] args) {
        System.out.println(findKthMissingElement(new int[]{1, 2, 5, 6, 7}, 4));
        System.out.println(findKthMissingElement(new int[]{1, 2, 5, 6, 7}, 8));
        System.out.println(findKthMissingElement(new int[]{2, 5, 6, 7}, 8));
    }

    static int findKthMissingElement(int[] arr, int k){
        int len = arr.length - 1;
        if(k <= arr[len]){
            int ele = arr[k - 1];
            return arr[arr.length - 1] + (ele - k);
        } else {
            int missingEleCount = arr[len] - arr.length;
            return arr[len] + (k - missingEleCount);
        }
    }
}
