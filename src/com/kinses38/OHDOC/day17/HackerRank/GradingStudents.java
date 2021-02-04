package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) >= 38) {
				int current = grades.get(i);
				if (current % 5 > 2)
					grades.set(i, (current + 5) - (current % 5));
			}
		}
		return grades;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(88, 67, 82, 38);
		System.out.println(gradingStudents(list));
		System.out.println(29 < 38);

	}
}
