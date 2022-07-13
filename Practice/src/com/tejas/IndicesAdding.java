package com.tejas;

import java.util.Arrays;

public class IndicesAdding {

	public static int[] middleChange(int[] arr, int input, int start, int end) {

		for (int i = start; i <= end; i++) {
			arr[i] = arr[i] + input;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 2, 6, 7 };
		int input = 3;
		int start = 1, end = 4;

		System.out.println(Arrays.toString(middleChange(arr, input, start, end)));
	}
}
