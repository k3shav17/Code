package com.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*You are given two integer arrays, A and B. 
 * B is an anagram of A meaning that B contains all the same elements of A but in a different order. 
 * Return an array that represents a mapping from every element in A to which index it occurs at in B.
Note: You may assume every element in A is unique.

Ex: Given the following A and B…

A = [8, 23, 2], B = [2, 23, 8], return [2, 1, 0] (8 appears at index 2 in B, 23 appears at index 1 in B, and 2 appears at index 0 in B).

Ex: Given the following A and B…

A = [9, 3, 1, 5, 2, 4], B = [2, 5, 1, 3, 4, 9], return [5,3,2,1,0,4].*/

public class AnagramElements {

	public static List<Integer> mappingIndex(int[] a, int[] b) {

		List<Integer> mapped = new ArrayList<Integer>();

		if (a.length != b.length) {
			return mapped;
		}
		Map<Integer, Integer> index = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			index.put(b[i], i);
		}
		for (int i = 0; i < b.length; i++) {

			if (index.containsKey(a[i]))
				mapped.add(index.get(a[i]));
		}
		return mapped;
	}

	public static void main(String[] args) {
//		int[] a = { 8, 23, 2 };
//		int[] b = { 2, 23, 8 };
//
		int[] a = {9, 3, 1, 5, 2, 4};
		int[] b = {2, 5, 1, 3, 4, 9};
		System.out.println(mappingIndex(a, b));
	}
}
