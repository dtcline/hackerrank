package algorithms.warmup.Staircase;

import java.util.Scanner;

public class Solution {

    private static void appendNStrings(StringBuilder sb, int n, String c) {
        for (int i = 0; i < n; ++i) {
            sb.append(c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String space = " ";
        String octothorpe = "#";
        StringBuilder result = new StringBuilder();
        int spaces = n - 1;
        int octothorpes = 1;
        for (int i = 0; i < n; ++i) {
            appendNStrings(result, spaces, space);
            appendNStrings(result, octothorpes, octothorpe);
            result.append("\n");
            --spaces;
            ++octothorpes;
        }
        System.out.println(result);
    }
}