package com.interview.amd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumberByConcat {
    public static void main(String[] args) {
        int a[] = { 7, 40, 3, 8 };
        System.out.println(printLargestNumber(a));
        String[] str = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
        printLargest(str);
    }



    static class CustomComparator implements Comparator<String>{

        @Override
        public int compare(java.lang.String o1, java.lang.String o2) {
            String o12 = o1 + o2;
            String o21 = o2 + o1;
            if(o12.equals(o21)) return 0;
            return o12.compareTo(o21) > 0 ? -1 : 1;
        }
    }

    private static void printLargest(String[] arr){
        System.out.println(Arrays.stream(arr).sorted());
        Arrays.sort(arr, new CustomComparator());
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static String printLargestNumber(int[] arr){
        int max = -1;
        int ind = -1;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            while(num != 0){
                int rem = num % 10;
                num = num / 10;
                if(num == 0 && max < rem){
                    max= rem;
                    ind = i;
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = ind; i < arr.length; i++) {
            str.append(arr[i]);
        }

        for (int i = 0; i < ind; i++) {
            str.append(arr[i]);
        }

        return str.toString();
    }
}
