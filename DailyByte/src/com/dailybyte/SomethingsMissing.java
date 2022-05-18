package com.dailybyte;

import java.util.Arrays;

/*
 * Given an array of sorted positive integers, nums, and a value k, return the kth missing number in nums.
 * Ex: Given the following nums and k…
 * nums = [1, 9, 13, 22], k = 4, return 5 (5 is the 4th missing number).
 * Ex: Given the following nums and k…
 * nums = [3, 4, 5], k = 2, return 2.
 * */
public class SomethingsMissing {

	public static int kthMissing(int[] arr, int k) {

		int newArr[] = new int[arr[arr.length - 1]];

		if (k >= 0 && k < arr[0]) {
			return k;
		}

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = i + 1;
		}

		System.out.println(Arrays.toString(newArr));
		return newArr[k];
	}

	public static void main(String[] args) {
		int[] arr = {3, 4, 5};
		int k = 2;

		System.out.println(kthMissing(arr, k));
	}
}
