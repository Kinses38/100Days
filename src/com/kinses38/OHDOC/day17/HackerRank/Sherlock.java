package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sherlock {

	static int sherlockAndAnagrams(String s) {
		int result = 0;
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				char[] c = s.substring(i, j).toCharArray();
				Arrays.sort(c);
				String curr = String.valueOf(c);
				if (map.containsKey(curr) && map.get(curr) > 0) {
					int value = map.get(curr);
					//because everytime we find another, it can be "anagram'd" with the previously found pairs.
					result += value;
					map.put(curr, map.get(curr) + 1);
				} else {
					map.put(curr, 1);
				}
			}
		}
		System.out.println(map.toString());
		return result;
	}

	public static void main(String[] args) {
		String s = "kkkk";
		System.out.println(sherlockAndAnagrams(s));
	}
}
