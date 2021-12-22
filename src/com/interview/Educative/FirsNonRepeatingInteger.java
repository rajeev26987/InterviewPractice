package com.interview.Educative;

import java.util.HashMap;
import java.util.Map;

public class FirsNonRepeatingInteger {
    private static int firstNonRepeatingInteger(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
