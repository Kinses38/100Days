package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class ArrayManipulation {

    static long arrayManip(int n, int[][] queries) {
        long[] results = new long[n];
        for (int i = 0; i < queries.length; i++) {
            for (int a = queries[i][0] - 1; a < queries[i][1]; a++) {
                results[a] += queries[i][2];
            }
        }
        System.out.println(Arrays.toString(results));
        Arrays.sort(results);
        return results[results.length - 1];
    }

    //todo do a run through of this again
    static long arrayManipEfficient(int n, int[][] queries) {
        long[] result = new long[n + 1];
        for (int i = 0; i < queries.length; i++) {
            result[queries[i][0]] += queries[i][2];
            if (queries[i][1] + 1 <= n) {
                result[queries[i][1] + 1] -= queries[i][2];
            }
        }
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 1; i < result.length; i++) {
            sum = sum + result[i];
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};
        System.out.println(arrayManipEfficient(n, queries));
    }
}
