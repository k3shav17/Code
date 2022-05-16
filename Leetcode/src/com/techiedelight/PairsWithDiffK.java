package com.techiedelight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given an unsorted integer array, print all pairs with a given difference k in it.
 * For example,
 * Input:
 * arr = [1, 5, 2, 2, 2, 5, 5, 4]
 * k = 3
 * Output:
 * (2, 5) and (1, 4) 
 * */
public class PairsWithDiffK {

	public static void pairs(int[] arr, int target) {

		Arrays.sort(arr);
		Set<Integer> uniquePairs = new HashSet<>();

		for (int i : arr) {

			if (uniquePairs.contains(i - target)) {
				System.out.printf("(%d, %d)", i, i - target);
				System.out.println();
			}
			if (uniquePairs.contains(i + target)) {
				System.out.printf("(%d, %d)", i + target, i);
				System.out.println();
			}
			uniquePairs.add(i);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 2, 2, 5, 5, 4 };
		pairs(arr, 3);
	}
}
