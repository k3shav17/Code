package com.dailybyte;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, nums, return the sum of all uniquely occurring elements.
 * 
 * Ex: Given the following nums…
 * 
 * nums = [1, 3, 5, 5, 2], return 6 (1 + 3 + 2).
 * 
 * Ex: Given the following nums…
 * 
 * nums = [4, 4, 2, 3, 3, 2], return 0.
*/

public class SumUniqueElements {

	public int uniqueSum(int[] arr) {

		if (arr.length == 0) {
			return -1;
		}

		HashMap<Integer, Integer> isUnique = new HashMap<>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			isUnique.put(arr[i], isUnique.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : isUnique.entrySet()) {

			if (entry.getValue() == 1) {
				sum += entry.getKey();
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 5, 2 };
		SumUniqueElements sme = new SumUniqueElements();
		System.out.println(sme.uniqueSum(arr));
	}
}
