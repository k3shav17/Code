package com.leetcode;

import java.util.Arrays;

public class SwapByParity {

	public static int largestInteger(int num) {
		String number = num + "";
		int[] arr = new int[number.length()];

		for (int i = 0; i < number.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;
			} else {
				int temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;

			}
		}

		System.out.println(Arrays.toString(arr));

		String paritySwap = "";

		for (int i = 0; i < arr.length; i++) {
			paritySwap += arr[i];
		}
		return Integer.parseInt(paritySwap);
	}

	public static void main(String[] args) {

		System.out.println(largestInteger(247));
	}
}
