package com.techiedelight;

import java.util.Arrays;

/*
 * Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
 * Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.
 * For example,
 * Input:  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }
 * Output: { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 } 
*/
public class DutchFlag {

	public static void makingDutchFlag(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		makingDutchFlag(arr);
		System.out.println(Arrays.toString(arr));
	}
}
