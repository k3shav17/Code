package com.techiedelight;

/*
 * Given an integer array, find a contiguous sub array within it that has the largest sum.
 * For example,
 * Input:  {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 * Output: Sub array with the largest sum is {4, -1, 2, 1} with sum 6.
 * */
public class MaxSumOfSubArrayKadanesAlgo {

	public static int kadanesAlgo(int[] arr) {
		int maxSoFar = 0, maxEndingHere = 0;

		for (int i : arr) {
			maxEndingHere += i;
			maxEndingHere = Integer.max(maxEndingHere, 0); // this method compares the two integers and return max of
															// those two
			maxSoFar = Integer.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(kadanesAlgo(arr));
	}
}