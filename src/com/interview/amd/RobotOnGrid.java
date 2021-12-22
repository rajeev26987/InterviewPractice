package com.interview.amd;

public class RobotOnGrid {
    public static void main(String[] args) {
        String in = "RRULDDDLR";
        moveRobotOnGrid(in);
    }

    private static void moveRobotOnGrid(String input){
        char[] chars = input.toCharArray();

        int up = 0, down = 0, right = 0, left = 0;

        for(char c:chars){
            switch (c){
                case 'R':
                    right++;
                case 'L':
                    left++;
                case 'U':
                    up++;
                case 'D':
                    down++;
            }
        }
        int x = up - down;
        int y = right - left;
        System.out.println("Robot's final position is (" + x + ", " + y + ")");
    }
}
