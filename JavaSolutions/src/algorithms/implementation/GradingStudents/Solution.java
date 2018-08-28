package algorithms.implementation.GradingStudents;

import java.io.*;
import java.util.*;

public class Solution {
    static int roundGrade(int grade) {
        if (grade < 38) return grade;
        if (grade >= 100) return 100;

        int nextMultiple = (grade / 5) * 5 + 5;

        return (nextMultiple - grade < 3) ? nextMultiple : grade;
    }

    static int[] gradingStudents(int[] grades) {
        int n = grades.length;
        int[] result = new int[n];

        for (int i = 0; i < n; ++i) {
            result[i] = roundGrade(grades[i]);
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}

