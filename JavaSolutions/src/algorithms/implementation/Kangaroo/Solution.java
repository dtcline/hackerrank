package algorithms.implementation.Kangaroo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String yes = "YES";
        String no = "NO";

        int first1 = x1 + v1 * 1;
        int first2 = x2 + v2 * 1;

        if (first1 == first2) {
            return yes;
        }

        for (int i = 2; i < 10000; ++i) {
            int c1 = x1 + v1 * i;
            int c2 = x2 + v2 * i;

            if (c1 == c2) {
                return yes;
            }

            if (first1 < first2 && c1 > c2) {
                return no;
            }

            if (first1 > first2 && c1 < c2) {
                return no;
            }
        }

        return no;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
