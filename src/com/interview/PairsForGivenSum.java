package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairsForGivenSum {
    static class Pair{
        private int a;
        private int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static void findPairs(int[] arr, int k){
        int len = arr.length;
        Map<Integer, List<Pair>> map = new HashMap<>(); // [3, [], ....]
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int sum = arr[i] + arr[j];
                if(map.containsKey(sum)){
                    List<Pair> list = map.get(sum);
                    list.add(new Pair(i, j));
                    map.put(sum, list);
                } else {
                    List<Pair> pairs = new ArrayList<>();
                    pairs.add(new Pair(i, j));
                    map.put(sum, pairs);
                }
            }
        }

        for (Map.Entry<Integer, List<Pair>> data : map.entrySet()){
            if(data.getKey() == k){
                data.getValue().forEach(item -> System.out.println(arr[item.a] + ", " + arr[item.b]));
            }
        }
    }

    public static void main(String[] args) {
        findPairs(new int[] {2, 5, 4, 3, 1, 9, 8, 7, 6}, 10);
    }
}
