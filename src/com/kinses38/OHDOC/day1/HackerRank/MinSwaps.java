package com.kinses38.OHDOC.day1.HackerRank;

//https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class MinSwaps {

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1)
                continue;
            tmp = i;
            while (arr[tmp] != i + 1) {
                tmp++;
            }
            int temp = arr[tmp];
            arr[tmp] = arr[i];
            arr[i] = temp;
            swaps++;

        }
        return swaps;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        System.out.println(minimumSwaps(arr));
        // 1  2  3  4  5  6  7  8
    }
}
