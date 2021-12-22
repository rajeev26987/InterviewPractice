package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Max1sIn2DArray {
    private static int rowIndexWithMax1s_BruteForce(int[][] arr){
        int maxIndex = 0, max = 0;
        int col = arr[0].length;
        int row = arr.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(max < col - j - 1 && arr[i][j] == 1){
                    maxIndex = i;
                    max = col - j - 1;
                }
            }
        }

        return maxIndex;
    }

    private static int rowIndexWithMax1s_BinarySearch(int[][] arr){
        int maxIndex = 0, max = 0;
        int col = arr[0].length;
        int row = arr.length;
        int firstIndex;
        for (int i = 0; i < arr.length; i++) {
            firstIndex = bs(arr[i], i, col - 1);
            if(firstIndex != -1 && max < col - firstIndex){
                max = col - firstIndex;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int bs(int[] ints, int low, int high) {
        if(high > low){
            int mid = low + (high - low) / 2;
            if(ints[mid] == 1)
                return mid;
            else if(ints[mid] == 0)
                return bs(ints, mid + 1, high);

        }
        return -1;
    }

    private static int rowIndexWithMax1s_WithLessTimeComplexity(int[][] arr){
        int maxIndex = 0;
        int col = arr[0].length;
        int row = arr.length;
        int j = col - 1;
        for (int i = 0; i < row; i++) {
            while(j >= 0 && arr[i][j] == 1){
                j--;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
        System.out.println(rowIndexWithMax1s_BruteForce(mat));
        System.out.println(rowIndexWithMax1s_WithLessTimeComplexity(mat));
    }
}
