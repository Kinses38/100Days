package com.kinses38.OHDOC.day6.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SumOfK {

    //TODO lots of unnecessary comparisons. Study DP
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        //t = weight/kilometers
        //k = max number of items
        int[] routes = new int[k];
        TreeSet<Integer> sums = new TreeSet<>(Collections.reverseOrder());
        calSums(ls, k, 0, 0, routes, sums);
        for (int sum : sums) {
            if (sum <= t) {
                return sum;
            }
        }
        //return null if not possible, ie less than k towns.
        return null;
    }

    public static void calSums(final List<Integer> ls, final int k, final int start, final int index, int[] routes, TreeSet<Integer> sums) {
        if (index == k) {
            final int sum = Arrays.stream(routes).reduce(0, Integer::sum);
            sums.add(sum);
            return;
        }
        for (int i = start; i < ls.size(); i++) {
            routes[index] = ls.get(i);
            calSums(ls, k, i + 1, index + 1, routes, sums);
        }
    }

    public static void main(String[] args) {


        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        System.out.println(SumOfK.chooseBestSum(163, 3, ts));
    }
}
