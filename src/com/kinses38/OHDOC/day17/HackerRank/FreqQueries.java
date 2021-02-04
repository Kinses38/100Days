package com.kinses38.OHDOC.day17.HackerRank;

import java.util.*;

public class FreqQueries {

	static List<Integer> freqQuery(int[][] queries) {
		List<Integer> results = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int[] freq = new int[queries.length + 1];
		int count = 0;
		for (int[] query : queries) {
			int num = query[1];
			switch (query[0]) {
				//add
				case 1:
					count = map.getOrDefault(num, 0);
					freq[count + 1]++;
					map.put(num, count + 1);
					if (freq[count] == 0) break;
					freq[count]--;
					break;
				case 2:
					count = map.getOrDefault(num, 0);
					if( count == 0) break;
					freq[count]--;
					freq[count-1]++;
					if(count == 1) map.remove(num);
					else map.put(num, count-1);
					break;
				case 3:
					if(num > freq.length) results.add(0);
					else{
						results.add(freq[num] > 0 ? 1 : 0);
					}
				}
			}

//		System.out.println(map.toString());
//		System.out.println(Arrays.toString(freq));
		return results;
	}

	public static void main(String[] args) {
		int[][] queries = {{3,4},{2,1003},{1,16},{3,1}};
		System.out.println(freqQuery(queries).toString());
	}
}
