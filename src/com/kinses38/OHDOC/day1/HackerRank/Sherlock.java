package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;
import java.util.HashMap;

//https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class Sherlock {

    static int sherlockAndAnagrams(String s) {
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String current = s.substring(i, j);
                char[] chars = current.toCharArray();
                Arrays.sort(chars);
                current = String.valueOf(chars);

                if (map.containsKey(current)) {
                    //we re-add the value each time as each substring can be paired with all previously found ones.
                    int value = map.get(current);
                    ans += value;
                    map.put(current, value + 1);
                } else {
                    map.put(current, 1);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(sherlockAndAnagrams(s));
        String s2 = "abcd";
        System.out.println(sherlockAndAnagrams(s2));
    }
}
