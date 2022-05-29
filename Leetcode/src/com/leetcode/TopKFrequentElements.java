package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
*/
public class TopKFrequentElements {

	public static int[] mostFrequent(int[] arr, int k) {

		int[] resultArr = new int[k];
		Map<Integer, Integer> frequent = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			frequent.put(arr[i], frequent.getOrDefault(arr[i], 0) + 1);
		}

		List<Integer> tempList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : frequent.entrySet()) {
			tempList.add(entry.getValue());
		}

		Collections.sort(tempList);
		for (int i = tempList.size() - 1, j = 0; i >= tempList.size() - k; i--, j++) {
			if (frequent.containsValue(tempList.get(i))) {
				resultArr[j] = frequent.get(tempList.get(i));
			}
		}
		return resultArr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int k = 2;

		System.out.println(Arrays.toString(mostFrequent(arr, k)));
	}
}
