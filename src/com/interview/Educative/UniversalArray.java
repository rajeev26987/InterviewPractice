package com.interview.Educative;

import java.util.ArrayList;
import java.util.List;

public class UniversalArray {
    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>();
        //in.add(4);in.add(4);in.add(2);in.add(2);in.add(4);in.add(2);
        in.add(2);
        in.add(4);
        in.add(4);
        in.add(2);
        in.add(4);
        in.add(4);
        in.add(2);
        in.add(2);
        in.add(2);
        in.add(4);
        in.add(4);
        in.add(4);
        in.add(2);
        in.add(2);
        System.out.println(findUniversalArrays(in));
    }

    private static int findUniversalArrays(List<Integer> arr){
        int counter = 0;
        boolean found = true;
        for (int i = 0; i < arr.size(); i++) {
            int j = i + 1, c4 = 0, c2 = 0;
            if(arr.get(i) == 4)
                c4++;
            else c2++;

            while(found){
                if(arr.get(j) == 4){
                    c4++;
                } else {
                    c2++;
                }

                if(c4 == c2){
                    counter++;
                    break;
                }
                j++;
            }
        }
        return counter;
    }
}
