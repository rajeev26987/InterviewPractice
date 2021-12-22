package com.interview.Educative.sorting;

public class SelectionSort {
    public static int[] sort(int[] arr){
        int len = arr.length;


        for (int i = 0; i < len; i++) {
            int min = i;

            for (int j = i + 1; j < len; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        sort(new int[] {64, 25, 12 , 22, 11});
    }
}
