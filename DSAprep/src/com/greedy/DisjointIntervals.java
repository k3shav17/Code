package com.greedy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a list of intervals [start, end].
 * Find the length of the maximal set of mutually disjoint intervals.
 * 
 *  Constraints:
 *  1 <= N < 1e5
 *  1 <= A[i][0] <= A[i][1] <= 1e9
 * */
public class DisjointIntervals {

	public int maximalSets(Integer[][] intervals) {

		int maximals = 0;
		Map<Integer, Integer> sets = new HashMap<>();

		for (Integer i = 0; i < intervals.length; i++) {
			sets.put(intervals[i][0], intervals[i][1]);
		}
		
		System.out.println(sets);
		return 0;
	}

	public static void main(String[] args) {

		Integer[][] arr = { { 1, 2 }, { 2, 10 }, { 4, 6 } };

		DisjointIntervals dj = new DisjointIntervals();
		System.out.println(dj.maximalSets(arr));
	}
}
