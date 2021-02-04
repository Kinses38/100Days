package com.kinses38.OHDOC.day17.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	//changing this to array. List is remedial
	public static int diagonalDifference(List<List<Integer>> list) {
		// Write your code here
		int left = 0, right = 0, i = 0;
		int j = list.size() - 1;

		while (i < list.size()) {
			left += list.get(i).get(i);
			right += list.get(i).get(j);
			i++;
			j--;
		}
		return Math.abs(left - right);
	}

	public static void main(String[] args) {
		List<Integer> first = Arrays.asList(11, 2, 4);
		List<Integer> second = Arrays.asList(4, 5, 6);
		List<Integer> third = Arrays.asList(10, 8, -12);
		List<List<Integer>> list = new ArrayList<>();
		list.add(first);
		list.add(second);
		list.add(third);

		System.out.println(diagonalDifference(list));
	}
}
