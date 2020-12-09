package com.kinses38.OHDOC.day2.CodeWars;

public class SpinWords {

    public static String spinWords(String sentence) {

        String[] arr = sentence.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5) {
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        String result = String.join(" ", arr);
        return result;
    }

    public static void main(String[] args) {
        String test = "This should spin all words that are 5 letters or longer";
        System.out.println(spinWords(test));
    }
}