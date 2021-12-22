package com.interview.amd;

public class SunDigitsUntillSingleDigit {
    public static void main(String[] args) {
        System.out.println(simpleDigitSum(31));
        System.out.println(digitSumWithWhile(1234));
    }

    static int simpleDigitSum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }

    static int digitSumWithWhile(int n)
    {
        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
