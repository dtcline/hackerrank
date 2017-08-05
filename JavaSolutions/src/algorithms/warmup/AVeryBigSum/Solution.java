package algorithms.warmup.AVeryBigSum;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    static BigInteger aVeryBigSum(int n, long[] ar) {
        BigInteger result = BigInteger.ZERO;
        for (long num : ar) {
            result = result.add(BigInteger.valueOf(num)); // BigInteger is immutable so reassignment necessary
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        BigInteger result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}

