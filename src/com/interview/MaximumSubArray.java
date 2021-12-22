package com.interview;

public class MaximumSubArray {
    /*
    * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    A subarray is a contiguous part of an array.

    Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

    Example 2:
    Input: nums = [1]
    Output: 1

    Example 3:
    Input: nums = [5,4,-1,7,8]
    Output: 23
    * */

    // it won't handle case when all nos are negative
    private static int findMaximumSumSubArray_v1(int[] arr){
        int maxEnding = 0, maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEnding = maxEnding + arr[i];
            if(maxSum < maxEnding){
                maxSum = maxEnding;
            }

            if(maxEnding < 0)
                maxEnding = 0;
        }
        return maxSum;
    }

    // handles all cases even when all nos are -ve. Use Dynamic programming
    private static int findMaximumSumSubArray_v2(int[] arr){
        int maxSoFar = arr[0], currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(findMaximumSumSubArray_v1(a));

        int[] b = {-1};
        System.out.println(findMaximumSumSubArray_v2(b));
    }
}
