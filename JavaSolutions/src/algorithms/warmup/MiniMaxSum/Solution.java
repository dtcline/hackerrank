package algorithms.warmup.MiniMaxSum;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int n = arr.length;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; ++i) {
            long currResult = 0L;

            for (int j = 0; j < n; ++j) {
                if (i == j) {
                    continue; // skip one number
                }
                currResult += arr[j];
            }

            if (currResult < min) {
                min = currResult;
            }

            if (currResult > max) {
                max = currResult;
            }
        }

        System.out.println(min + " " + max);
    }
}

