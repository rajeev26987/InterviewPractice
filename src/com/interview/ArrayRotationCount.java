package com.interview;

public class ArrayRotationCount {
    // input: [4, 5, 1, 2, 3]
    // output = 2

    private static int countRotationsOfArray(int[] arr){
        int min_val = arr[0], idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(min_val > arr[i]){
                min_val = arr[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(countRotationsOfArray(new int[] {4, 5, 1, 2, 3}));
    }
}
