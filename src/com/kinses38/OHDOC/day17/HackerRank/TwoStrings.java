package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

	static String twoStrings(String s1, String s2){
		Set<Character> set;
		set = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		for(char curr : s2.toCharArray()){
			if(set.contains(curr))
				return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		String s1 = "and", s2 = "brt";
		System.out.println(twoStrings(s1,s2));
	}
}
