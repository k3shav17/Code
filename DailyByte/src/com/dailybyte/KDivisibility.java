package com.dailybyte;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array, nums, and a value, k, return the total number of contiguous subarrays that are divisible by k.
 * 
 * Ex: Given the following nums and k…
 * 
 * nums = [1, 3, 1, 2, 5], k = 7, return 2 ([1, 3, 1, 2] and [2, 5] both sum to 7).
*/
public class KDivisibility {

	public static int isDivisibleByK(int[] arr, int k) {

		List<List<Integer>> contigiousArrays = new ArrayList<>();
		int sum = 0;
		int i = 0;
		int l = 0;

		while (i < arr.length) {

			List<Integer> subArray = new ArrayList<>();
			sum = sum + arr[i];
			if (sum % k == 0) {
				for (int j = l; j <= i; j++) {
					subArray.add(arr[j]);
				}
				sum = arr[i];
				contigiousArrays.add(subArray);
				l = i;
			}
			i++;
		}
		return contigiousArrays.size();
	}

	public static void main(String[] args) {

		int[] array = { 1, 3, 1, 2, 5 };
		int k = 7;

		System.out.println(isDivisibleByK(array, k));
	}
}
