package com.interview.Educative;

import java.util.Arrays;

public class AddUptoN {
    public static void main(String[] args) {
        int[] in = new int[] {64, 25, 12 , 22, 11};
        int sum = 23;

        int p1 = 0, p2 = in.length - 1;

        Arrays.sort(in);
        int[] r = new int[2];
        while(p1 != p2){
            int thisSum = in[p1] + in[p2];
            if(thisSum < sum){
                p1++;
            } else if(thisSum > sum){
                p2--;
            } else{
                r[0] = in[p1];
                r[1] = in[p2];
                break;
            }
        }

        for (int i : in) System.out.println(i);
    }
}
