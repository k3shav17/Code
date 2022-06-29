package com.greedy;

import java.util.Arrays;

/*
 * Given an array of N integers.
 * Find the highest product by multiplying 3 elements.
 * 
 * Contraints
 * 3 <= N <= 5e5
 * 
 * */
public class HighestProduct {

	public int maxProduct(int[] arr) {
		Arrays.sort(arr);

		int len = arr.length;

		int highThree = arr[len - 1] * arr[len - 2] * arr[len - 3];
		int lowTwoHigh1 = arr[0] * arr[1] * arr[len - 1];

		return Integer.max(highThree, lowTwoHigh1);
	}

	public static void main(String[] args) {

		int[] arr = { -5, -2, -1, 0, 0, 1, 1, 5 };

		HighestProduct hp = new HighestProduct();
		System.out.println(hp.maxProduct(arr));
	}
}
