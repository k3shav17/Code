package com.fcc.comques;

import java.util.Arrays;

/**
 * Given a sorted array of integers arr and an integer target, find the index of
 * the first and last position of target in arr. In target can't be found in
 * arr, return [-1, -1]
 *
 */

public class FnLofSR {

	public int[] startAndEnd(int[] arr, int target) {

		int[] index = { -1, -1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				index[0] = i;
				while (i + 1 < arr.length && arr[i + 1] == target)
					i += 1;
				index[1] = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 5, 5, 5, 5, 7, 9 };
		int target = 5;

		FnLofSR fsr = new FnLofSR();
		System.out.println(Arrays.toString(fsr.startAndEnd(arr, target)));
	}
}
