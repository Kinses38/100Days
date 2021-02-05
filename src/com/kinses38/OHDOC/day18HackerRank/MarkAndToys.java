package com.kinses38.OHDOC.day18HackerRank;

import java.util.Arrays;

public class MarkAndToys {

	static int maximumToys(int[] prices, int k){
		int result = 0;

		Arrays.sort(prices);
		for(int curr : prices){
			if(k - curr > 0){
				k -= curr;
				result++;
			} else
				return result;
		}
		return result;
	}

	public static void main(String[] args) {
		int k = 7;
		int[] prices = {1,4,3,2};
		System.out.println(maximumToys(prices, k));

	}
}
