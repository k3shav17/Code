package com.practice;

import java.util.Arrays;

public class ReversingGroups {

	public static void reverse(int[] arr, int groupSize) {

		int j = 0;
		int[] newArr = new int[arr.length];

		for (int i = groupSize - 1; i >= 0; i--) {
			newArr[j++] = arr[i];
		}
		
		for (int i = arr.length - 1 - groupSize; i >= groupSize; i--) {
			newArr[j++] = arr[i];
		}
		
		for (int i = arr.length - 1; i > arr.length - 1 - groupSize; i--) {
			newArr[j++] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int groupSize = 3;
		
		ReversingGroups.reverse(arr, groupSize);
	}
}
