package com.interview.Educative;

public class BuySellStocks {
    private static void buySellStocks(int[] input){
        int minSoFar = input[0];
        int maxProfit = 0;
        int buy = 0;
        int sell = 0;
        int temp = 0;

        for (int j : input) {
            temp = maxProfit;
            minSoFar = Math.min(minSoFar, j);
            maxProfit = Math.max(maxProfit, j - minSoFar);
            if(temp != maxProfit){
                buy = minSoFar;
                sell = j;
            }
        }
        System.out.println("Max profit " + maxProfit + " with buy at " + buy + " and sell at "+ sell);
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3 , 5, 10, 15, 2, 1, 0};
        buySellStocks(arr);
    }
}
