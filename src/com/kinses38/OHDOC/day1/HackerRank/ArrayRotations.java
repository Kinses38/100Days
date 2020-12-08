package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class ArrayRotations {

    static int[] arrayRotations(int[] a, int d) {
        int temp = 0;
        for (; d > 0; d--) {
            temp = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;
        System.out.println(Arrays.toString(arrayRotations(a, d)));
    }
}
