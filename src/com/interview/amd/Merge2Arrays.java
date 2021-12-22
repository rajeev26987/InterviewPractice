package com.interview.amd;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7};
        int[] ar2 = {2, 4, 6, 8};

        merge(ar1, ar2);
    }

    private static void merge(int[] ar1, int[] ar2){
        int[] res = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length){
            if(ar1[i] < ar2[j])
                res[k++] = ar1[i++];
            else res[k++] = ar2[j++];
        }

        while (i < ar1.length)
            res[k++] = ar1[i++];

        while (j < ar2.length)
            res[k++] = ar2[j++];

        System.out.println(Arrays.toString(res));
    }
}
