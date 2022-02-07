package com.interview;

import java.util.ArrayList;
import java.util.List;

public class CalculateForExpressionString {
    public static void main(String[] args) {
        System.out.println(findCombinations("4*1-3*2"));
    }

    static boolean checkOperator(char op){
        return op == '*' || op == '-' | op == '+';
    }

    static int performCalc(int l, int r, char c){
        if(c == '*')
            return l * r;
        if(c == '-')
            return l - r;
        if(c == '+')
            return l + r;
        return l + r;
    }

    static List<Integer> findCombinations(String input){
        List<Integer> result = new ArrayList<>();
        for(int  i = 0; i < input.length(); i++){
            char thisChar = input.charAt(i);
            if(checkOperator(thisChar)){
                List<Integer> left = findCombinations(input.substring(0, i));
                List<Integer> right = findCombinations(input.substring(i + 1));

                for(Integer l : left){
                    for(Integer r : right){
                        result.add(performCalc(l, r, thisChar));
                    }
                }
            }
        }

        if(result.size() == 0){
            result.add(Integer.parseInt(input));
        }

        return result;
    }
}
