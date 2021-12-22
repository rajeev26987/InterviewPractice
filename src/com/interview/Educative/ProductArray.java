package com.interview.Educative;

public class ProductArray {
    private static int[] findProduct(int arr[])
    {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int result[] = new int[n];

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++)
        {
            result[i] = temp;
            temp *= arr[i];
        }

        // Initializing temp to 1 for product on right side
        temp = 1;

        // Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--)
        {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] res = findProduct(new int[] {5, 2, 3, 4});
        for(int i : res) System.out.println(i);
    }
}
