package com.interview.Educative;

public class RemoveEvenNos {
    public static void main(String[] args) {
        int[] in = new int[] {1, 2, 3, 4, 5};
        int[] out = new int[in.length];
        for (int i = 0, j = 0; i < in.length; i++) {
            if(in[i] % 2 != 0){
                out[j] = in[i];
                j++;
            }
        }

        for (int i : out)
            System.out.println(i);
    }
}
