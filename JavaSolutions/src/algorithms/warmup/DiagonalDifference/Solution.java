package algorithms.warmup.DiagonalDifference;

/*
3
11 2 4
4 5 6
10 8 -12

2
11 2
4 5

1
11

 */

import java.util.*;

public class Solution {

    // assumes mat is square
    private static int diagonalDifference(int[][] mat) {
        int n = mat.length;
        // special cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return mat[0][0];
        }

        int primarySum = 0;
        for (int i = 0; i < n; ++i) {
            primarySum += mat[i][i];
        }

        int secondarySum = 0;
        for (int i = 0, j = n - 1; i < n && j >= 0; ++i, --j) {
            secondarySum += mat[i][j];
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        // read in using row-major order
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int currNum = in.nextInt();
                mat[i][j] = currNum;
            }
        }

        System.out.println(diagonalDifference(mat));
    }
}
