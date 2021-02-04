package com.kinses38.OHDOC.day17.HackerRank;

import java.util.HashSet;
import java.util.Set;

public class SalesByMatch {

	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		Set<Integer> set = new HashSet<>();
		for (int curr : ar) {
			if (set.contains(curr)) {
				pairs++;
				set.remove(curr);
			} else {
				set.add(curr);
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		int n = 7;
		int[] arr = {1, 2, 1, 2, 1, 3, 1};
		System.out.println(sockMerchant(n, arr));
	}
}
