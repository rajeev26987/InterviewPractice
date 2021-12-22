package com.interview.amd;

import java.nio.file.LinkPermission;
import java.util.Arrays;

public class ReverseStringPreservingOrder {
    // Input = I am Java Developer, Output = r ep olev eDavajamI
    public static void main(String[] args) {
        String input = "I am Java Developer";
        char[] output = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                output[i] = ' ';
            }
        }

        int j = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (output[j] == ' ') {
                    j--;
                }
                output[j] = input.charAt(i);
                j--;
            }
        }

        System.out.println(String.valueOf(output));
    }
}
