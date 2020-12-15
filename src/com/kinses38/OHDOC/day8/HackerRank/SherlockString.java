package com.kinses38.OHDOC.day8.HackerRank;

public class SherlockString {

    static String isValid(String s) {
        int[] freq = new int[26];
        boolean correctionUsed = false;
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < freq.length - 1; i++) {
            //ie AAAB
            if ((freq[i] + 1 < freq[i + 1] || freq[i] - 1 > freq[i + 1]) && freq[i] != 0 && freq[i + 1] != 0)
                return "NO";
            //ie AAB
            if ((freq[i] + 1 == freq[i + 1] || freq[i] - 1 == freq[i + 1]) && freq[i] != 0 && freq[i + 1] != 0) {
                if (correctionUsed)
                    return "NO";
                else {
                    freq[i + 1] = freq[i];
                    correctionUsed = !correctionUsed;
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        String test = "abcdefghhgfedecba";

        System.out.println(isValid(test));
    }
}
