package com.kinses38.OHDOC.day2.CodeWars;

public class NaturalNumbers {
    //Needlessly iterating over all numbers, will do for now but need to research more maths
    public static int solution(int number) {
        int result = 0;
        if (number >= 0) {
            for (int i = 3; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    result += i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println(solution(num));
    }
}
