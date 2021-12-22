package com.interview.amd;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String input = "aabbccaa";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : input.toCharArray()){
            map.computeIfPresent(c, (k,v) -> v + 1);
            map.putIfAbsent(c, 1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet())
            System.out.println(entry.getKey().toString() + entry.getValue());
    }
}
