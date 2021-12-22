package com.interview;

import java.util.ArrayList;
import java.util.List;

public class DuplicateItemInArray {
    private static List<Integer> findDuplicateElementsInArray(int[] lis){
        int[] res = new int[lis.length + 1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lis.length; i++) {
            int it = lis[i];
            if(res[it] >= 0)
                res[it] += 1;
        }

        for (int i = 0; i < res.length; i++) {
            if(res[i] != 0 && res[i] == 2){
                result.add(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        for (Integer i : findDuplicateElementsInArray(new int[] {4,3,2,7,8,2,3,1}))
            System.out.println(i);
    }
}
