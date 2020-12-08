package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
public class MaxToys {
    static int maximumToys(int[] prices, int k) {
        int ans = 0;
        if (k == 0 || prices.length == 0) return ans;
        Arrays.sort(prices);

        for (int currentToy : prices) {
            k -= currentToy;
            if (k < 0) return ans;
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int budget = 50;
        System.out.println(maximumToys(prices, budget));
    }
}
