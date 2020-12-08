package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
public class CountSwaps {

    static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void countSwaps(int[] arr) {
        int swap = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap++;
                }
            }

        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 10, 3, 2};
        System.out.println(Arrays.toString(arr));
        countSwaps(arr);
    }
}
