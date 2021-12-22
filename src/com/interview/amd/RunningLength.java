package com.interview.amd;

public class RunningLength {
    public static void main(String[] args) {
        String input = "aabbaaaaaaaaaaaabbbccccccccaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbaaaaaaaaa";
        int j = 0;
        for (int i = 0; i < input.length();) {
            int counter = 1;
            j = i + 1;
            while(j < input.length() && input.charAt(i) == input.charAt(j)){
                counter++;
                j++;
            }
            System.out.print(input.charAt(i));
            System.out.print(counter);
            i = j;
        }
    }
}
