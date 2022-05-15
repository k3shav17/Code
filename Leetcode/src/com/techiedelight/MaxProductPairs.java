package com.techiedelight;

/*
 * Given an integer array, find the maximum product of two integers in it.
 * For example, consider array {-10, -3, 5, 6, -2}. The maximum product is the (-10, -3) or (5, 6) pair.
 * */
public class MaxProductPairs {

	public static void productPairs(int[] arr) {

		int max1 = arr[0], max2 = Integer.MIN_VALUE;
		int min1 = arr[0], min2 = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
			if (arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			} else if (arr[i] < min2) {
				min2 = arr[i];
			}
		}

		if (max1 * max2 > min1 * min2) {
			System.out.printf("Pair (%d, %d) ", max1, max2);
		} else {
			System.out.printf("Pair (%d, %d) ", min1, min2);
		}
	}

	public static void main(String[] args) {

		int[] arr = { -10, -3, 5, 6, -2 };
		productPairs(arr);
	}
}
