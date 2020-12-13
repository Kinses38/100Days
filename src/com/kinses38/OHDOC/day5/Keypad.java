package com.kinses38.OHDOC.day5;

public class Keypad {

    //TODO redo with map/stream
    static String[] keyboard = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", "#", " 0"};

    public static int presses(String phrase) {
        int result = 0;
        phrase = phrase.toUpperCase();
        for (int i = 0; i < phrase.length(); i++) {
            for (String group : keyboard) {
                if (group.contains(phrase.substring(i, i + 1))){
                    result += group.indexOf(phrase.charAt(i)) + 1;
                    break;
                }
            }
        }

        return result;
    }

    public static int pressesMap(String phrase){
        int result = 0;


        return result;
    }

    public static void main(String[] args) {

        String test = "WHERE DO U WANT 2 MEET L8R";
        System.out.println(presses(test));
    }
}
