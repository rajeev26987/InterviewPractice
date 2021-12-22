package com.interview.amd;

public class Add2Fractions {
    private static int gcd(int a, int b){
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }

    private static int lcmWithGcd(int a, int b){
        int gcd = gcd(a, b);
        return a * b / gcd; // formula for lcm
    }

    private static int simpleLcm(int a, int b){
        int lcm = Math.max(a, b);

        while(true){
            if(lcm % a == 0 && lcm % b == 0)
                return lcm;
            ++lcm;
        }
    }

    private static void addFractions(int num1, int den1, int num2, int den2){
        int lcm = lcmWithGcd(den1, den2);

        int finalNum = num1 * (lcm / den1) + num2 * (lcm/den2);

        System.out.println(finalNum + "/" + lcm);
    }

    public static void main(String[] args) {
        System.out.println(gcd(20, 60));
        System.out.println(simpleLcm(20, 60));
        System.out.println(lcmWithGcd(20, 60));

        addFractions(1, 20, 1, 60);
    }


}
