package com.interview;

import java.util.ArrayList;
import java.util.List;

public class SortedArrangement {
    // https://leetcode.com/discuss/interview-question/371225/Sorted-Arrangements-or-Infosys-Specialist-Programmer-or-On-campus-hackerrank
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(10);
                add(6);
                add(2);
                add(3);
                add(7);
                add(1);
                add(2);
            }
        };
        System.out.println(minimumOps(list));
    }

    static int minimumOps(List<Integer> arr){
        int max = 0;
        List<Integer> current = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            max += insert(current, arr.get(i));
        }

        return max;
    }

    static int insert(List<Integer> curList, int num){
        if(curList.size() == 0){
            curList.add(0, num);
            return 1;
        }

        int Left = findFirst(curList, num);
        int Right = findLast(curList, num);

        if(Left < curList.size() - Right){
            curList.add(Left, num);
            return 2 * Left + 1; // 2 because no of deletion and insertion will be equal for existing elements + 1 for inserting a new element
        }
        else{
            curList.add(Right, num);
            return 2 * (curList.size() - Right - 1) + 1;
        }
    }

    public static int findFirst(List<Integer> curList, int num){
        int start = 0, end = curList.size()-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(curList.get(mid) >= num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static int findLast(List<Integer> curList, int num){
        int start = 0, end = curList.size()-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(curList.get(mid) <= num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }


}
