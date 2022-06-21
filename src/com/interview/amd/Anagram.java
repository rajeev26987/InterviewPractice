package com.interview.amd;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "arc";
        String s2 = "car";

        if(s1.length() != s2.length())
            System.out.println("Not Anagram");

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s1.length(); i++){
            map.computeIfPresent(s1.charAt(i), (k, v) -> v + 1);
            map.putIfAbsent(s1.charAt(i), 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if(map.containsKey(s2.charAt(i))){
                int val = map.get(s2.charAt(i));
                if(--val == 0)
                    map.remove(s2.charAt(i));
            }
        }

        System.out.println(map.size() == 0);
    }
}
