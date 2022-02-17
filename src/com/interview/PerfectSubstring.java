package com.interview;
/*
A String s comprised of digits from 0 to 9 contains a perfect substring if all the elements within a substring occur exactly k times.
Calculate the number of perfect substrings in s.
In other words, we have to find the number of substrings in which the count of each character is k.
Example:
s = 1102021222
k = 2
Output: 6
Explanations:
The 6 perfect substrings are:
1. 11
2. 110202
3. 102021
4. 0202
5. 22
6. 22
 */
public class PerfectSubstring {
    public static void main(String[] args) {
        System.out.println(perfectSubstring("1102021222", 2));
    }
    static boolean check(int[] arr, int k) {
        for(int val : arr) {
            if(val != 0 && val != k) return false;
        }
        return true;
    }

    static int perfectSubstring(String s, int k) {
        int res = 0;
        for(int i=0; i<s.length(); i++) {
            int[] arr = new int[10];
            for(int j = i; j<s.length(); j++) {
                if(j > i + (10*k))
                    break;
                char ch = s.charAt(j);
                arr[ch-'0']++;
                if(check(arr, k))
                    res++;
            }
        }
        return res;
    }
}
