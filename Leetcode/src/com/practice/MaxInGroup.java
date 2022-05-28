package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MaxInGroup {

	public static void maxInArr(int[] arr, int k) {

		List<Integer> maxArr = new ArrayList<Integer>();

		for (int a = 0; a < arr.length; a = a + k) {
			int max = arr[a];
			for (int b = a, c = 0; c < k; b++, c++) {
				if (arr[b] > max) {
					max = arr[b];
				}
			}
			maxArr.add(max);
		}
		System.out.println(maxArr);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 6, 7, 2, 6, 8, 9 };
		int k = 2;

		maxInArr(arr, k);
	}
}
