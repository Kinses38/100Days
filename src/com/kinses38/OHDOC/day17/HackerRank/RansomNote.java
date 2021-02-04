package com.kinses38.OHDOC.day17.HackerRank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	static void checkMagazine(String[] magazine, String[] note) {
		Map<String, Integer> wordsAvail = new HashMap<>();

		for (String s : magazine) {
			if (wordsAvail.containsKey(s)) {
				wordsAvail.put(s, wordsAvail.get(s) + 1);
			} else {
				wordsAvail.put(s, 1);
			}
		}

		for (String s : note) {
			if (wordsAvail.containsKey(s) && wordsAvail.get(s) > 0) {
				wordsAvail.put(s, wordsAvail.get(s) - 1);
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}


	public static void main(String[] args) {
		String[] magazine = {"give", "me", "one", "grand", "today", "night"};
		String[] message = {"give", "me", "one", "grand", "today"};
		checkMagazine(magazine, message);

	}
}
