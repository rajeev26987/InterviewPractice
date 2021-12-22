package com.interview.Educative.algos;

public class KnapSack {
    private static int knapSackUsingRecursion(int[] w, int[] p, int capacity, int index){
        int p1 = 0, p2 = 0;
        // base case
        if(capacity <= 0 || index == 0)
            return 0;

        // capacity do not match. move to next item
        if(w[index] > capacity)
            return knapSackUsingRecursion(w, p, capacity, index - 1);

        // cas1: if we do not add this item in the knapsack
        p1 = knapSackUsingRecursion(w, p, capacity, index - 1);
        // case2: if we add this item in the knapsack
        p2 = p[index] + knapSackUsingRecursion(w, p, capacity - w[index], index - 1);

        // calculate max profit out of case1 & case 2
        return Math.max(p1, p2);
    }
    public static void main(String[] args) {
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        System.out.println(knapSackUsingRecursion(weights, profits, 7, 3));
    }
}
