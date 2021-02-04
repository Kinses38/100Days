package com.kinses38.OHDOC.day17.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

	//Realistically an array would be much better here.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(0, 0);
		result.add(1, 0);

		for (int i = 0; i < 3; i++) {
			if (a.get(i).compareTo(b.get(i)) < 0)
				result.set(1, result.get(1) + 1);
			else if (a.get(i).compareTo(b.get(i)) > 0)
				result.set(0, result.get(0) + 1);
		}

		return result;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(10, 15, 20);
		List<Integer> b = Arrays.asList(5, 6, 7);

		System.out.println(Arrays.toString(compareTriplets(a, b).toArray()));


	}

}
