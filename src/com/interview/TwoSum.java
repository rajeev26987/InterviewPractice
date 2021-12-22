package com.interview;

import java.util.*;

public class TwoSum {
    private static List<Integer> twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if(map.containsKey(arr[val]) && map.get(arr[val]) != i){
                result.add(i);
                result.add(map.get(arr[val]));
                break;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1,2,3,4}, 3));
    }
}
