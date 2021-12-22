package com.interview;

import java.util.Arrays;

public class SetRowsColumnsWith1 {
    public static void main(String[] args) {
        int[][] mat =
                {
                        { 0, 1, 0 },
                        { 1, 0, 0 },
                        { 0, 0, 0 }
                };
        convert_O_MXN(mat);
        for (int[] r: mat) {
            System.out.println(Arrays.toString(r));
        }
    }



    // this is with extra space and O(mxn)complexity
    private static void convert_O_MXN(int[][] arr){
        int r[] = new int[arr.length];
        int c[] = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            r[i] = 0;
        }

        for (int i = 0; i < arr[0].length; i++) {
            c[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(r[i] == 1 || c[j] == 1){
                    arr[i][j] = 1;
                }
            }
        }
    }
}
