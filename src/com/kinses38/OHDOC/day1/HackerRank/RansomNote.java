package com.kinses38.OHDOC.day1.HackerRank;

import java.util.HashMap;

//https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : magazine) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String s : note) {
            if (map.containsKey(s) && map.get(s) != 0) {
                map.put(s, map.get(s) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};
        checkMagazine(magazine, note);
    }

}
