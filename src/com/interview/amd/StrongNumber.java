package com.interview.amd;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(isStrongNumber(145));
        System.out.println(isStrongNumber(534));
    }

    private static boolean isStrongNumber(int number){
        int[] facts = computeFactorial();
        int temp = number, factSum = 0;

        while(temp > 0){
            factSum += facts[temp % 10];
            temp /= 10;
        }

        return factSum == number;
    }

    private static int[] computeFactorial(){
        int[] factorials = new int[10];

        factorials[0] = factorials[1] = 1;

        for (int i = 2; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        return factorials;
    }
}
