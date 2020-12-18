package com.kinses38.OHDOC.day10.LeetCode;

public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        //read up on valley
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        while (i < prices.length - 1) {
            //Short circuit the and to prevent index out of bounds
            while (i < prices.length - 1  && prices[i] >= prices[i + 1])
                i++;
            //keep going until we find price less than current one
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            //keep going until we find price higher than current one
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}
