package com.kinses38.OHDOC.day6.CodeWars;

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {

    //TODO I dont need an index here as "if two words have the same score return the earlier one" is handled already.
    public static String high(String s) {
        String winner = "";
        int max = 0;
        String[] separated = s.split(" ");
        for (int i = 0; i < separated.length; i++) {
            String current = separated[i];
            int tmp = 0;
            for (int j = 0; j < current.length(); j++) {
                //magic value because charAt('a') returns 10
                tmp += (Character.getNumericValue(current.charAt(j))-9);
            }
            if (tmp > max){
                max = tmp;
                winner = separated[i];
            }
        }
        return winner;
    }

    //TODO study, not necessarily better. Just interesting.
    public static String highStream(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }

    public static void main(String[] args) {
        System.out.println(high("take me to semynak"));
    }
}
