package com.interview;

public class Add2Strings {
    public static String add(String a, String b) {
        int i = a.length();
        int j = b.length();
        int k = Math.max(i, j) + 1; // room for carryover
        char[] c = new char[k];
        for (int digit = 0; k > 0; digit /= 10) {
            if (i > 0)
                digit += a.charAt(--i) - '0';
            if (j > 0)
                digit += b.charAt(--j) - '0';
            c[--k] = (char) ('0' + digit % 10);
        }

        return new String(c, k, c.length - k);
    }

    public static void main(String[] args) {
        System.out.println(add("123", "456"));
    }
}
