package com.techiedelight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Find maximum length subarray having a given sum
 * Given an integer array, find the maximum length subarray having a given sum.
 * For example, consider the following array:
 * nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
 * target = 8
 * Subarrays with sum 8 are
 * { -5, 5, 3, 5 }
 * { 3, 5 }
 * { 5, 3 }
 * The longest subarray is { -5, 5, 3, 5 } having length 4
 * 
 */
public class MaxSubArrayLength {

	public static void subLength(int[] arr, int target) {

		Map<Integer, Integer> hm = new HashMap<>();
		List<Integer> length = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(target - arr[i])) {
				length.add(arr[hm.get(target - arr[i])]);
			}

			hm.put(arr[i], i);
		}
		
		System.out.println(length);
		System.out.println(length.size());
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int target = 8;

		MaxSubArrayLength.subLength(arr, target);
	}
}
