package com.leetcode;

public class MissingPositiveNumber {

	public static int findKthPositive(int[] arr, int k) {

		int number = 1, count = 0, i = 0;

		while (count != k) {

			if (i < arr.length && arr[i] == number) {

				i++;
			} else
				count++;

			number++;
		}
		return number - 1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;

		System.out.println(findKthPositive(arr, k));
	}
}
