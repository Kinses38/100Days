package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Collections;

public class StairCase {

	static void staircase11(int n) {
		String space = " ";
		String hash = "#";
		for (int i = 1; i < n; i++) {
			System.out.println(space.repeat(n - i) + hash.repeat(i));
		}

	}

	static void staircase(int n) {
		int c = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < c) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
			c--;
		}
	}

	public static void main(String[] args) {
		int n = 6;
		staircase(n);
	}
}
