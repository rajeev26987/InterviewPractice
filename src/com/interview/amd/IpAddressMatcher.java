package com.interview.amd;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressMatcher {
    public static void main(String[] args) {
        String regex =
                "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("125.235.5656.112");
        if(matcher.matches()){
            System.out.println("Matched");
        }
    }

}
