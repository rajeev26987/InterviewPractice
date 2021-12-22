package com.interview.wipro;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //Arrays.stream(arr).forEach(item -> System.out.println(item));
        //int sum = 5;

        // pair of nos whose sum is 5

        Map<Integer, List<Pair>> map = new HashMap<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int sum = arr[i] + arr[j];
                if(map.containsKey(sum)){
                    List<Pair> lis = map.get(sum);
                    lis.add(new Pair(i, j));
                    map.put(sum, lis);
                    //System.out.println(arr[p.a] + ' ' + arr[p.b]);
                } else {
                    List<Pair> p = new ArrayList<>();
                    p.add(new Pair(i, j));
                    map.put(sum, p);
                }
            }
        }

        List<Pair> p = map.values().stream().filter(i -> i.size() > 1).flatMap(Collection::stream).collect(Collectors.toList());
        p.forEach(item -> System.out.println("(" + arr[item.a] + ", " + arr[item.b] + ")"));
        System.out.println("Done");
    }

    static class Pair{
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
