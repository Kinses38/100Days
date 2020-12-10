package com.kinses38.OHDOC.day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        int result = 0;
        Stack<int[]> stack = new Stack<>();
        if (intervals != null && intervals.length > 0) {
            Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
            stack.push(intervals[0]);
            for (int i = 0; i < intervals.length; i++) {
                int[] top = stack.peek();
                if (top[1] < intervals[i][0]) {
                    stack.push(intervals[i]);
                } else if (top[1] < intervals[i][1]) {
                    top[1] = intervals[i][1];
                    stack.pop();
                    stack.push(top);
                }
            }
            for (int[] current : stack) {
                result += current[1] - current[0];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] test2 = new int[][]{{1, 5}, {1, 6}, {5, 11}, {10, 20}, {16, 19}};
        int testSum2 = 19;

        System.out.println(sumIntervals(test2));

    }
}
