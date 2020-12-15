package com.kinses38.OHDOC.day8.HackerRank;

import java.util.Arrays;

public class MakingAnagrams {

    static int makeAnagram(String a, String b){
        int result = 0;
        int[] aFreq = new int[26];
        //get frequency of string a chars
        //get frequency of string b chars
        //use an array to store freq in indexes
        //count differences?
        for(char c : a.toCharArray()){
            aFreq[c -'a']++;
        }
        for(char c : b.toCharArray()){
            aFreq[c - 'a']--;
        }
        for(int i : aFreq){
            result+= Math.abs(i);
        }
        System.out.println(Arrays.toString(aFreq));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("abc", "ade"));
    }
}
