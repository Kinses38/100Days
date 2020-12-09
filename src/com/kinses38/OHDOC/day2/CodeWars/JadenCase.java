package com.kinses38.OHDOC.day2.CodeWars;

import java.util.Arrays;
import java.util.Locale;

public class JadenCase {

    //Could defo refactor this to be a bit more clever.
    public static String toJadenCase(String phrase) {
        String[] phrases;
        String result;
        if (phrase != null && phrase.length() > 0) {
            phrases = phrase.split("\\s+");
            for (int i = 0; i < phrases.length; i++) {
                phrases[i] = phrases[i].substring(0, 1).toUpperCase(Locale.ROOT) + phrases[i].substring(1);
            }
            System.out.println(Arrays.toString(phrases));
            result = String.join(" ", phrases);
            return result;
        }

        return null;
    }

    public static void main(String[] args) {
        String test1 = "most trees are blue";
        String test2 = "";

        System.out.println(toJadenCase(test1));
        System.out.println(toJadenCase(test2));
    }
}
