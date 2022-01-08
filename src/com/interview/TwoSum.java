package com.interview;

import java.util.*;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if(map.containsKey(val)){
                return new int[] { map.get(val), i };
            } else map.put(arr[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4}, 3)));
    }
}
