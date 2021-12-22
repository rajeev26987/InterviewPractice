package com.interview.amd;

public class SecondSmallestFromArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 5, 6, 6, 7, 2};
        secondMinimumElement(a);
    }

    private static void secondMinimumElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                s_min = min;
                min = arr[i];
            } else if (arr[i] < s_min && arr[i] != min)
                s_min = arr[i];
        }
        System.out.println("Minimum element " + min + " and Second Min " + s_min);
    }
}
