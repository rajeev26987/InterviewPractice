package com.interview;

public class FancyNumber {
    /*
    Given a mobile number and some conditions for a fancy number, find if the given number is fancy.
    A 10 digit mobile number is called fancy if it satisfies any of the following three conditions.
    1. A single number occurs three consecutive times. Like 777.
    2. Three consecutive digits are either in increasing or decreasing fashion. Like 456 or 987.
    3. A single digit occurs four or more times in the number. Like 9859009976 – here the digit 9 occurs 4 times.
     */
    public static void main(String[] args) {
        System.out.println(checkForFancyNumber("9535633770"));
        System.out.println(checkForFancyNumber("7654449244"));
        System.out.println(checkForFancyNumber("4568267135"));
    }
    private static String checkForFancyNumber(String mobileNumber){
        int[] counter = new int[10];
        int prev = -1, consecutive = 0;
        int increasingOrder = 0, decresingOrder = 0;
        for (int i = 0; i < mobileNumber.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(mobileNumber.charAt(i)));
            counter[digit] += 1;

            if(counter[digit] > 3)
                return "YES";

            if(prev == digit)
                consecutive += 1;

                // incresing order
            else if(prev == digit + 1 && prev != -1){
                increasingOrder += 1;
                decresingOrder = 0;
                //consecutive = 1;
            }
            else if(digit == prev + 1 && prev != -1){
                decresingOrder += 1;
                increasingOrder = 0;
                //consecutive = 1;
            }

            if(consecutive == 3)
                return "YES";

            if(increasingOrder == 2 || decresingOrder == 2)
                return "YES";

            prev = digit;
        }

        return "NO";
    }
}
