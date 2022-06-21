package com.interview;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class KPalindrome {
    // Function to check if the given string is k–palindrome or not
    public static int isKPalindrome(String X, int m, String Y, int n)
    {
        // if either string is empty, remove all characters from the other string
        if (m == 0 || n == 0) {
            return n + m;
        }

        // ignore the last characters of both strings if they are the same
        // and recur for the remaining characters
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return isKPalindrome(X, m - 1, Y, n - 1);
        }

        // if the last character of both strings is different

        // remove the last character from the first string and recur
        int x = isKPalindrome(X, m - 1, Y, n);

        // remove the last character from the second string and recur
        int y = isKPalindrome(X, m, Y, n - 1);

        // return one more than the minimum of the above two operations
        return 1 + Integer.min(x, y);
    }

    public static void main(String[] args)
    {
        String s = "CABCBC";
        int k = 2;

        // get reverse of s
        String rev = new StringBuilder(s).reverse().toString();

        if (isKPalindrome(s, s.length(), rev, s.length()) <= 2*k) {
            System.out.println("The string is k–palindrome");
        }
        else {
            System.out.println("The string is not a k–palindrome");
        }
    }
}
