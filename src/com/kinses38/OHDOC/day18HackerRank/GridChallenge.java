package com.kinses38.OHDOC.day18HackerRank;

import java.util.Arrays;

public class GridChallenge {

	static String gridChallenge(String[] grid) {
		int dim = grid[0].length();
		for (int i = 0; i < grid.length; i++) {
			char[] c = grid[i].toCharArray();
			Arrays.sort(c);
			if (i > 0) {
				for (int j = 0; j < dim; j++) {
					//Modulus to wrap single dimension array to 2d. Compare with row above.
					if (c[j] < grid[i - 1].charAt(j % dim))
						return "NO";
				}
			}
			grid[i] = new String(c);
		}
		return "YES";
	}

	public static void main(String[] args) {
		String[] arr = {"zzz", "ade", "efg"};
		System.out.println(gridChallenge(arr));
	}
}
