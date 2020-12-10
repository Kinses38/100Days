package com.kinses38.OHDOC.day2.CodeWars;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * This solution is most likely way too overcomplicated given the problem.
 */
public class RomanNumerals {

    static TreeMap<Integer, String> decToRom = new TreeMap<>(Collections.reverseOrder()) {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    static TreeMap<String, Integer> romToDec = new TreeMap<>(decToRom.entrySet()
            .stream()
            .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey)));

    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            for (Map.Entry<Integer, String> entry : decToRom.entrySet()) {
                if (n / entry.getKey() != 0) {
                    result.append(entry.getValue());
                    n = n - entry.getKey();
                    break;
                }
            }
        }
        return result.toString();

    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (romanNumeral.substring(i).length() >= 2 && romToDec.containsKey(romanNumeral.substring(i, i + 2))) {
                result += romToDec.get(romanNumeral.substring(i, i + 2));
                i++;
            } else {
                result += romToDec.get(romanNumeral.substring(i, i + 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String date2008 = "MMVIII";
        int mmviii = 2008;
        String date1666 = "MDCLXVI";
        int mdclxvi = 1666;

        System.out.println(mmviii + " = " + toRoman(mmviii));
        System.out.println(mdclxvi + " = " + toRoman(mdclxvi));


        //Map digit value to correct representation
        System.out.println(date1666 + " = " + fromRoman(date1666));
        System.out.println(date2008 + " = " + fromRoman(date2008));
        System.out.println(fromRoman("XLIV"));
        System.out.println(fromRoman("I"));

    }


}
