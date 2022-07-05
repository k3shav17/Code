package com.fcc.comques;

import java.util.Arrays;

/*
 * Given an array of integers arr and an integer k,
 * find the kth largest element
 * */

public class KthLargestElement {

	public int klargeElement(int[] arr, int k) {
		
		Arrays.sort(arr);
		return arr[arr.length - k];
	}
	public static void main(String[] args) {
		int[] arr = { 4, 2, 9, 7, 5, 6, 7, 1, 3 };
		int k = 4;
		
		KthLargestElement kth = new KthLargestElement();
		System.out.println(kth.klargeElement(arr, k));
	}
}
