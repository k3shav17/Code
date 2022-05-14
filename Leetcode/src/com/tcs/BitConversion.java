package com.tcs;

// ones to zeros and zeros to ones
public class BitConversion {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				arr[i] = 0;
			} else
				arr[i] = 1;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
