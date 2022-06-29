package com.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

		int maximals = 1;
		Map<Integer, Integer> sets = new HashMap<>();

		for (Integer i = 0; i < intervals.length; i++) {
			sets.put(intervals[i][0], intervals[i][1]);
		}
		System.out.println(sets);
		TreeMap<Integer, Integer> sorted = new TreeMap<>();
		sorted.putAll(sets);

		int previousStart = intervals[0][0];
		int previousEnd = intervals[0][1];

		for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {

			if (entry.getKey() < previousEnd) {
				continue;
			} else {
				previousStart = entry.getKey();
				previousEnd = entry.getValue();
				maximals += 1;
			}
		}
		return maximals;
	}

	public static void main(String[] args) {

		Integer[][] arr = { { 1, 4 }, { 2, 3 }, { 4, 6 }, { 8, 9 } };

		DisjointIntervals dj = new DisjointIntervals();
		System.out.println(dj.maximalSets(arr));
	}
}
