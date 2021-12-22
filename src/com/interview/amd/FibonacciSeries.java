package com.interview.amd;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fib_simple(20));
        System.out.println(fib_recursive(20));
    }

    private static int fib_simple(int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    private static int fib_recursive(int n){
        if(n <= 1) return n;

        return fib_recursive(n - 2) + fib_recursive(n - 1);
    }

    private static int fib_dp(int n){
        if(n <= 1) return n;

        return fib_recursive(n - 2) + fib_recursive(n - 1);
    }
}
