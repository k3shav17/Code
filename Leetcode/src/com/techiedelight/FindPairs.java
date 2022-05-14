package com.techiedelight;

import java.util.HashMap;
import java.util.Map;

/*Find a pair with the given sum in an array
Given an unsorted integer array, find a pair with the given sum in it.

For example,
Input:
 
nums = [8, 7, 2, 5, 3, 1]
target = 10
 
Output:
Pair found (8, 2)
or
Pair found (7, 3)
 
Input:
nums = [5, 2, 6, 8, 1, 9]
target = 12
Output: Pair not found*/

public class FindPairs {

	public static void sumPairs(int[] arr, int target) {

		Map<Integer, Integer> pairs = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (pairs.containsKey(target - arr[i])) {

				System.out.printf("Pair found (%d %d) ", arr[pairs.get(target - arr[i])], arr[i]);
				System.out.println();
			}
			pairs.put(arr[i], i);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		sumPairs(arr, target);
	}
}
