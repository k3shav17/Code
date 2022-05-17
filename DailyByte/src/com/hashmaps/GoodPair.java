package com.hashmaps;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an integer array that is sorted in ascending order and a value target, 
 * return two unique indices (one based) such that the values at those indices sums to the given target.
 * Note: If no two such indices exist, return null.
 * Ex: Given the following nums and target…
 * nums = [1, 2, 5, 7, 9], target = 10, return [1,5].
 * Ex: Given the following nums and target…
 * nums = [1, 3, 8], target = 13, return null.
 * */

public class GoodPair {

	public static String findingPairs(int[] arr, int target) {
		Map<Integer, Integer> pair = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (pair.containsKey(Math.abs(target - arr[i]))) {
				 return pair.get(target - arr[i]) + 1 + ", " +  (i + 1);
			}
			pair.put(arr[i], i);
		}
		return null;
	}

	public static void main(String[] args) {

//		int[] arr = { 1, 2, 5, 7, 9 };
		int[] arr = { 1, 3, 8 };
		System.out.println(findingPairs(arr, 13));
	}
}
