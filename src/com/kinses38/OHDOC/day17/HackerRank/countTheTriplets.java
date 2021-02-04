package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countTheTriplets {

	static long countTriplets(List<Long> list, long r) {
		long result = 0L;
		Map<String, Long> pairMap = new HashMap<>();
		Map<Long, Long> map = new HashMap<>();
		for (int i = list.size()-1; i >= 0; i--) {
			long curr = list.get(i);
			long r_r = curr * r;
			long r_r_r = curr * r * r;

			//if its the first element of a triplet
			result += pairMap.getOrDefault((r_r + "" + r_r_r), 0L);

			//if its the 2nd element, check pairs map and normal map for the prev element.
			pairMap.put(curr +""+ r_r, pairMap.getOrDefault(curr+""+r_r,0L )+ map.getOrDefault(r_r, 0L)) ;

			//if its the third element
			map.put(curr,map.getOrDefault(curr,0L)+1L);

		}
		return result;
	}

	public static void main(String[] args) {
		long r = 2L;
		List<Long> list = Arrays.asList(1L, 2L, 2L, 4L);
		System.out.println(countTriplets(list, r));
	}

}
