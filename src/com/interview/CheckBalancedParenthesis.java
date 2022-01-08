package com.interview;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBalancedParenthesis {
    public static void main(String[] args) {
        System.out.println(checkBalancedParenthesis("{[]}()"));
        System.out.println(checkBalancedParenthesis("{[]}("));
        System.out.println(checkBalancedParenthesis("}"));
    }

    private static boolean checkBalancedParenthesis(String input){
        Deque<Character> ds = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char ele = input.charAt(i);
            // check for opening braces
            if(ele == '{' || ele == '[' || ele == '('){
                ds.push(ele);
                continue;
            }
            if(ds.isEmpty())
                return false;

            char closedBrace;
            // check for closing braces
            switch (ele){
                case '}':
                    closedBrace = ds.pop();
                    if(closedBrace == '(' || closedBrace == '[')
                        return false;
                    break;
                case ']':
                    closedBrace = ds.pop();
                    if(closedBrace == '(' || closedBrace == '{')
                        return false;
                    break;
                case ')':
                    closedBrace = ds.pop();
                    if(closedBrace == '[' || closedBrace == '{')
                        return false;
                    break;
            }
        }
        return ds.isEmpty();
    }
}
