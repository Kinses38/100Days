package com.kinses38.OHDOC.day1.HackerRank;

import java.util.HashSet;

//https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class SubString {

    static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String bigString = "Shaun";
        String lilString = "aun";
        String separateString = "xxx";

        System.out.println(twoStrings(bigString, lilString));
        System.out.println(twoStrings(bigString, separateString));
    }
}
