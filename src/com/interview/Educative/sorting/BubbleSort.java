package com.interview.Educative.sorting;

public class BubbleSort {
    public static int[] sort(int[] arr){
        boolean s = false;
        do {
            s = false;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i-1] > arr[i]){
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;
                    s = true;
                }
            }
        } while(s);

        return arr;
    }
    public static void main(String[] args) {
        sort(new int[] {64, 25, 12 , 22, 11});
    }
}
