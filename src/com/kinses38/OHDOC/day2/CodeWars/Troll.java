package com.kinses38.OHDOC.day2.CodeWars;

public class Troll {
    public static String disemvowel(String str) {
        String pattern = "[aeoiuAEOIU]";
        return str.replaceAll(pattern, "");
    }

    public static void main(String[] args) {
        String testOne = "This website is for losers LOL!";
        System.out.println(disemvowel(testOne));
    }
}


