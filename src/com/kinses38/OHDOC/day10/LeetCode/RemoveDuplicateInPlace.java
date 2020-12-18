package com.kinses38.OHDOC.day10.LeetCode;

import java.util.Arrays;

public class RemoveDuplicateInPlace {

    public static int removeDuplicates(int[] num) {
        int firstp = 0;
        for (int current = 0; current < num.length; current++) {
            if (num[current] != num[firstp]) {
                num[firstp + 1] = num[current];
                firstp++;
            }
        }
        //offset
        return firstp + 1;
    }

    public static void main(String[] args) {
        int[] sorted = {1, 1, 1, 1, 2, 3, 3, 4, 5, 5};
        int length = removeDuplicates(sorted);
        System.out.println(Arrays.toString(sorted));
        System.out.println(length);
    }
}
