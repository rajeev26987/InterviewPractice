package com.interview;

public class ClimbStairs {
    static int countWays(int n, int m)
    {
        int res[] = new int[n + 1];
        int temp = 0;
        res[0] = 1;

        for(int i = 1; i <= n; i++)
        {
            int s = i - m - 1;
            int e = i - 1;
            if (s >= 0)
            {
                temp -= res[s];
            }
            temp += res[e];
            res[i] = temp;
        }
        return res[n];
    }

    // considering 1 or 2 steps at a time
    static int countWaysRecursively(int n){
        if(n <= 1)
            return 1;
        return countWaysRecursively(n - 1) + countWaysRecursively(n - 2);
    }



    // Driver Code
    public static void main(String[] args)
    {
        int n = 5, m = 2;
        System.out.println("Number of ways = " +
                countWays(n, m));

        System.out.println(countWaysRecursively(5));
    }
}
