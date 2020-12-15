package com.kinses38.OHDOC.day8.HackerRank;

public class AlternatingCharacter {

    static int alternatingCharacters(String s) {
        int result = 0;
        char[] arr = s.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                result++;
        }

        return result;
    }


    public static void main(String[] args) {
        String test = "AAABBB";
        System.out.println(alternatingCharacters(test));
    }
}
