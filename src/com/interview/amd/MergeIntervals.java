package com.interview.amd;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] example1 = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println("Example 1 => {1,3}{2,6}{8,10}{15,18}");
        System.out.print("Result    => ");
        printArray(mergeIntervals(example1));

        int[][] example2 = {{1,4},{4,5}};
        System.out.println("\nExample 2 => {1,4}{4,5}");
        System.out.print("Result    => ");
        printArray(mergeIntervals(example2));

        int[][] example3 = {{1,4},{4,5},{5,8}};
        System.out.println("\nExample 3 => {1,4}{4,5}{5,8}");
        System.out.print("Result    => ");
        printArray(mergeIntervals(example3));
    }
    public static int[][] mergeIntervals(int[][] input) {
        if(input.length <= 0)
            return input;

        // Arrays.sort(input, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] ints : input) {
            if (list.size() == 0 || list.getLast()[1] < ints[0]) {
                list.add(ints);
            } else {
                int maxVal = Math.max(list.getLast()[1], ints[1]);
                list.getLast()[1] = maxVal;
            }
        }


        return list.toArray(new int[list.size()][]);

    }

    public static void printArray(int[][] input) {

        for (int r = 0; r < input.length; r++) {
            System.out.print("{");
            for (int c = 0; c < input[r].length; c++) {
                System.out.print(input[r][c]);
                if(c == 0) System.out.print(",");
            }
            System.out.print("}");
        }
        System.out.println("");

    }
}
