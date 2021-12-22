package com.interview.amd;

import java.util.HashSet;
import java.util.Set;

public class CommonFrom3Arrays {
    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        findCommon(ar1, ar2, ar3);

        findCommonUsingSet(ar1, ar2, ar3);
    }

    private static void findCommon(int ar1[], int ar2[], int ar3[])
    {
        // Initialize starting indexes for ar1[], ar2[] and ar3[]
        int i = 0, j = 0, k = 0;

        // Iterate through three arrays while all arrays have elements
        while (i < ar1.length && j < ar2.length && k < ar3.length)
        {
            // If x = y and y = z, print any of them and move ahead
            // in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]){
                System.out.print(ar1[i]+" ");
                i++; j++; k++;
            }

            // x < y
            else if (ar1[i] < ar2[j])
                i++;

                // y < z
            else if (ar2[j] < ar3[k])
                j++;

                // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }
    }
    
    private static void findCommonUsingSet(int ar1[], int ar2[], int ar3[]){
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>();

        for (int i = 0; i < ar1.length; i++) {
            set1.add(ar1[i]);
        }

        for (int i = 0; i < ar2.length; i++) {
            set2.add(ar2[i]);
        }

        for (int i = 0; i < ar3.length; i++) {
            if(set1.contains(ar3[i]) && set2.contains(ar3[i])){
                if(set3.contains(ar3[i]))
                    System.out.println(ar3[i]);
                set3.add(ar3[i]);
            }
        }
    }
}
