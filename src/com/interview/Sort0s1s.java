package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort0s1s {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[] {0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(sort0s1s2s(new int[] {0, 1, 2, 0, 1, 2, 0, 2, 1})));
        Map<String, Integer> t = new HashMap<>();
    }

    private static int[] sort(int[] arr){
        int zeroIdx = 0, oneIdx = arr.length - 1;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                temp[oneIdx--] = 1;
            else if(arr[i] == 0)
                temp[zeroIdx++] = 0;
        }
        return temp;
    }

    private static int[] sort0s1s2s(int[] arr){
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }

        int  i = 0;
        while(c0 > 0){
            arr[i++] = 0;
            c0--;
        }

        while(c1 > 0){
            arr[i++] = 1;
            c1--;
        }

        while(c2 > 0){
            arr[i++] = 2;
            c2--;
        }

        return arr;
    }
}
