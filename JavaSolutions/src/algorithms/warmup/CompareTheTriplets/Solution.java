package algorithms.warmup.CompareTheTriplets;

import java.util.*;

public class Solution {
    private static void awardPoints(int alice, int bob, int[] points) {
        if (alice > bob) {
            ++points[0];
        } else if (bob > alice) {
            ++points[1];
        }
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] points = new int[2];

        awardPoints(a0, b0, points);
        awardPoints(a1, b1, points);
        awardPoints(a2, b2, points);

        return points;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }
}