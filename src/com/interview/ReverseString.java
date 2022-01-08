package com.interview;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Rajeev");
    }

    private static void reverseString(String input){
        if(input.length() <=  1){
            System.out.println(input);
        } else {
            System.out.print(input.charAt(input.length() - 1));
            reverseString(input.substring(0, input.length() - 1));
        }
    }
}
