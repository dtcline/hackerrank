package algorithms.warmup.BirthdayCakeCandles;

import java.util.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i : ar) {
            if (i > max) { // found new max so set new max and start new count
                max = i;
                count = 1;
            } else if (i == max) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
