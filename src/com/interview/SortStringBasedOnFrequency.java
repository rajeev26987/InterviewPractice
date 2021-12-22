package com.interview;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortStringBasedOnFrequency {
    private static String sortBasedOnFrequency(String s){
        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(freqMap.get(c), maxFreq);
        }

        /*
        Jagged Array: Where Number of rows are known but the Columns are not.
        * */
        List<Character>[] list = new ArrayList[maxFreq + 1];

        for (char ch : freqMap.keySet()){
            int count = freqMap.get(ch);
            if(list[count] == null)
                list[count] = new ArrayList<>();
            list[count].add(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            if(list[i] != null){
                List<Character> l = list[i];

            }
        }
        return "";
    }
    public static void main(String[] args) {
        
    }
}
