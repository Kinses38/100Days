package com.kinses38.OHDOC.day1.HackerRank;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers 'a' and integer sum, see if there exists a pair in 'a' that equals the sum.
 */
public class ContainsSum {

    public static boolean sol(int[] a, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int i : set) {
            if (set.contains(sum - i)) {
                return true;
            }
        }

        return false;
    }

    //This avoids the {5}, sum = 10 issue by checking the presence before adding.
    static void printPairs(int[] arr, int sum) {
        Set<Integer> s = new HashSet<>();
        for (int j : arr) {
            int temp = sum - j;

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + j
                                + ", " + temp + ")");
                return;
            }
            s.add(j);
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int[] a = {3, 5, 6, 4};
        int sum = 10;
        System.out.println(sol(a, sum));
        printPairs(a, sum);

    }
}
