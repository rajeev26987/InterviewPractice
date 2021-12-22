package com.interview.amd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintNonDuplicateElements {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 5, 6, 6, 7, 2};
        printNonDuplicateElements(a);
    }

    private static void printNonDuplicateElements(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if(map.containsKey(j)){
                int v = map.get(j);
                map.put(j, ++v);
                continue;
            }
            map.put(j, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
        }

    }
}
