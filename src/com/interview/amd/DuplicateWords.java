package com.interview.amd;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Good day day bye bye"; // output: Good day bye
        Set<String> set = new HashSet<>();
        boolean result = false;
        for(String s : str.split(" ")){
            result = set.add(s);
        }
        System.out.println(result ? "No Duplicates" : "Duplicates were found");
    }
}
