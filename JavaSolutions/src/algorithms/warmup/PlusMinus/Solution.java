package algorithms.warmup.PlusMinus;

/*
6
-4 3 -9 0 4 1

 */

import java.util.Scanner;

public class Solution {

    private static void printResult(int count, int size) {
        // special case: don't get tricked into dividing by 0 or dividing 0 by something else!
        if (size == 0 || count == 0) {
            System.out.println(0.0);
        } else {
            System.out.println(((double) count) / ((double) size));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        // assume size is positive
        int[] nums = new int[size];
        for (int i = 0; i < size; ++i) {
            nums[i] = in.nextInt();
        }

        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        for (int i : nums) {
            if (i > 0) {
                ++positives;
            } else if (i < 0) {
                ++negatives;
            } else {
                ++zeroes;
            }
        }

        printResult(positives, size);
        printResult(negatives, size);
        printResult(zeroes, size);
    }
}