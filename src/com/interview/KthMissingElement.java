package com.interview;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class KthMissingElement {
    public static void main(String[] args) {
        System.out.println(findKthMissingElement(new int[]{1, 2, 5, 6, 7}, 4));
        System.out.println(findKthMissingElement(new int[]{1, 2, 5, 6, 7}, 8));
        System.out.println(findKthMissingElement(new int[]{2, 5, 6, 7}, 8));
        System.out.println(findKthMissingElement(new int[]{1, 2, 5, 6, 8, 9, 11, 12, 13, 15}, 5));


    }

    static int findKthMissingElement(int[] arr, int k){
        int len = arr.length - 1;
        if(k <= arr[len]){
            int ele = arr[k - 1];
            return arr[arr.length - 1] + (ele - k);
        } else {
            int missingEleCount = arr[len] - arr.length;
            return arr[len] + (k - missingEleCount);
        }
    }

    static int findMissingElement(int[] arr, int k){
        int counter = arr.length;
        int numberOnKthPlace = arr[k];
        if(numberOnKthPlace==k){
            return 0;
        }
        if(arr[counter]==counter){

        }
        int noOfMissingElements = arr[counter]-counter;
        if(noOfMissingElements>=k){
            if(counter%2==0)
                counter = counter/2;
            else
                counter = counter/2+1;
        }
        if(arr[counter]==counter){

        }
        noOfMissingElements = arr[counter]-counter;
        if(noOfMissingElements>=k){

        } else{

        }

        return 0;

    }
}
