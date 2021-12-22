package com.interview;

import java.util.Arrays;

public class EfficientJanitor {
    /*
    The janitor at Hacker High School is insanely efficient. By the end of each day, all of the waste from the
    trash cans in the school has been shifted into plastic bags which can carry waste weighing between
    1.01 pounds and 3.00 pounds. All the plastic bags must be dumped into the trash cans outside the school.
    The janitor can carry at most 3.00 pounds at once.
    One trip is described as selecting a few bags which together don't weigh more than 3.00 pounds,
    dumping them in the outdoor trash can and returning to the school.
    The janitor wants to make minimum number of trips to the outdoor trash can.
    Given the number of plastic bags, n, and the weights of each bag,
    determine the minimum number of trips if the janitor selects bags in the optimal way.
    For example, given n = 6 plastic bags weighing weight = [1.01, 1.99, 2.5, 1.5, 1.01],
    the janitor can carry all the trash out in 3 trips: [1.01 + 1.99 , 2.5, 1.5 + 1.01].
     */
    public static void main(String[] args) {
        double[] arr = new double[] {1.01, 1.99, 2.5, 1.5, 1.01};
        int lIdx = 0;
        int trips = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > 1.99)
                trips++;

            else if(arr[i] <= 1.99){
                if(arr[i] + arr[lIdx] <= 3)
                    lIdx++;
                trips++;
            }

            if(lIdx >= i)
                break;
        }

        System.out.println(trips);
    }
}
