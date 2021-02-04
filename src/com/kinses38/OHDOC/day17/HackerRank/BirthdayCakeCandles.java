package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class BirthdayCakeCandles {

	public static int birthdayCakeCandles(List<Integer> candles) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i : candles) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		return map.get(map.lastKey());
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 2, 1, 3);
		System.out.println(birthdayCakeCandles(list));
	}
}
