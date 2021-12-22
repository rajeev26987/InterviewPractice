package com.interview;

public class HouseRobberyProblem {
    private static int rob(int[] nums){
        if(nums == null || nums.length == 0) return 0;

        int prev = 0;
        int current = nums[0];
        for(int i=1; i<nums.length; i++){
            int temp = Math.max(current, prev+nums[i]);
            prev = current;
            current = temp;
        }

        return Math.max(prev, current);
    }
    public static void main(String[] args) {
        System.out.println(rob(new int[]{6, 7, 1, 3, 8, 2, 5}));
    }
}
