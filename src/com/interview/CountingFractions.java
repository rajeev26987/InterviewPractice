package com.interview;

import java.util.ArrayList;
import java.util.List;

public class CountingFractions {

    static int hcf(int n, int d){
        if(n == 0)
            return d;
        return hcf(d%n, n);
    }

    static int countProperFractions(int max_d) {
        int counter = 0;
        List<Integer> nums = new ArrayList<>();
        List<Integer> dens = new ArrayList<>();
        for (int i = 1; i <= max_d; i++) {
            for (int j = 1; j < i; j++) {
                nums.add(j);
                dens.add(i);
            }
        }
        for (int j = 0; j < nums.size(); j++) {
            if(hcf(nums.get(j), dens.get(j)) == 1)
                counter++;
        }
        return counter;
    }
}
