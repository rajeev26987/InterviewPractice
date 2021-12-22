package com.interview;

public class JumpinWithArrayElements {
    private static boolean checkIfJumpingWillReachArrayEnd(int[] arr){
        boolean[] jumps = new boolean[arr.length];
        jumps[0] = true;

        for (int i = 0; i < arr.length; i++) {
            if(jumps[i] && arr[i] > 0){
                int maxJumps = arr[i];

                for (int j = 1; j < maxJumps; j++) {
                    if(i + j < jumps.length)
                        jumps[i + j] = true;
                }
            }
        }

        return jumps[arr.length - 1];
    }
}
