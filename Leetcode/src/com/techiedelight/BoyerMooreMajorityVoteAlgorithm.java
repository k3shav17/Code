package com.techiedelight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given an integer array containing duplicates, return the majority element if present. 
 * A majority element appears more than n/2 times, where n is the array size.
 * For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.
 * */

public class BoyerMooreMajorityVoteAlgorithm {

	public static String majorityElement(int arr[]) {

		Map<Integer, Integer> vote = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			vote.put(arr[i], vote.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : vote.entrySet()) {
			if (entry.getValue() > arr.length / 2)
				return "Majority element in the array is " + entry.getKey();
		}
		return "No majority element is present";
	}

	public static void main(String[] args) {
		int[] arr = { 2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2 };
		System.out.println(majorityElement(arr));
	}
}
