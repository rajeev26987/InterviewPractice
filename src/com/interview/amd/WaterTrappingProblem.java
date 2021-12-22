package com.interview.amd;

public class WaterTrappingProblem {
    public static void main(String[] args) {
        int[] heights = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
        System.out.println(trapWater(heights));
        System.out.println(trapWaterUsingExtraSpace(heights));
    }

    private static int trapWaterUsingExtraSpace(int[] arr){
        int[] left = new int[arr.length];
        left[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            // this stores the max height till now at this index on the left
            left[i] = Integer.max(left[i-1], arr[i - 1]); // [0, 7, 7, 7, 7, 7, 7, 7, 7, 7]
        }

        int right = 0, water = 0;

        // processing from right to left
        // ( starting from len - 2 coz extreme right building won't store any water as it is the last building
        // and for the same reason it will run only until 2nd building.
        for (int i = arr.length - 2; i >= 1; i--) {
            right = Math.max(right, arr[i + 1]); // this is finding the max height of the building on the right

            int minHeight = Integer.min(left[i], right); // this gives us the minimum height of the building among the left and the right
            if(minHeight > arr[i])
                water += minHeight - arr[i];
        }

        return water;
    }

    private static int trapWater(int[] arr){
        return 0;
    }
}
