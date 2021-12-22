package com.interview.Educative;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 4, 5};
        int[] arr2 = new int[] {2, 6, 7, 8};
        int[] out = new int[arr1.length + arr2.length];
        for(int i = 0; i < out.length; i++){
            if(arr1.length <= i){
                out[i] = arr2[i - arr1.length];
            } else {
                out[i] = arr1[i];
            }
        }
        Arrays.sort(out);
        for(int i : out)
            System.out.println(i);
    }
}
