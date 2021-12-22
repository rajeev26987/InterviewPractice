package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NthLargestNumber {
    public static void main(String[] args) {
        System.out.println(findNthLargestNumber(new int[] {1, 2, 2, 3, 3, 4, 5}, 4));
    }
    private static int findNthLargestNumber(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int freq = 0;
        for (int j : arr) {
            if(!map.containsKey(j)){
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq += entry.getValue();
            if(freq >= target){
                return entry.getKey();
            }
        }
        return -1;
    }
}
