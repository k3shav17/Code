package com.tcs;

import java.util.Arrays;

// given a = {3, 6, 8, 9}, missed numbers are = {1,2,4,5,7,10}
public class MissedNumbers {

	public static void main(String[] args) {

		int[] a = { 3, 6, 8, 9, 11 };
		Arrays.sort(a);

		int numberIndex = 0;

		for (int i = 1; i <= a[a.length - 1]; i++) {
			if (i == a[numberIndex]) {
				numberIndex++;
			} else
				System.out.print(i + " ");
		}
	}
}
