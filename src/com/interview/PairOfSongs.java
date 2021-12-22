package com.interview;

import java.util.HashMap;
import java.util.Map;

public class PairOfSongs {
    private static int pairsDivisibleBy60(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, val = 0, diff = 0;

        for (int i = 0; i < arr.length; i++) {
            val = arr[i] % 60;
            diff = (60 - val) % 60;

            if(map.containsKey(diff))
                count += map.get(diff);

            if(map.containsKey(val))
                map.put(val, map.get(val) + 1);
            else
                map.put(val, 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(pairsDivisibleBy60(new int[] {30,20,150,100,40}));
    }
}
