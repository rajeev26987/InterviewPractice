package com.interview;

import java.util.Arrays;

public class SquaredSortedArray {
    public static void main(String[] args) {
        squaredSortedArray(new int[] {1, 2, 3});
        squaredSortedArray(new int[] {-6, -3, -1, 2, 4, 5});
    }

    private static void squaredSortedArray(int[] arr){
        int len = arr.length;
        int l = 0, r = len - 1;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                res[i] = arr[l] * arr[l];
                l++;
            } else {
                res[i] = arr[r] * arr[r];
                r--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
