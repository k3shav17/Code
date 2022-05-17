package com.techiedelight;

import java.util.Arrays;

/*
 * In this post, we will see how to right-rotate an array by specified positions. 
 * For example, right rotating array { 1, 2, 3, 4, 5, 6, 7 } three times will result in array { 5, 6, 7, 1, 2, 3, 4 }.
*/
public class RightRotateAnArray {

	public static void swap(int[] arr, int i, int j) {

		int data = arr[i];
		arr[i] = arr[j];
		arr[j] = data;
	}

	public static void reverse(int[] arr, int low, int high) {
		for (int i = low, j = high; i < j; i++, j--) {
			swap(arr, i, j);
		}
	}

	public static void rightRotate(int[] arr, int r) {

		if (r >= arr.length || r < 0) {
			return;
		}

		reverse(arr, arr.length - r, arr.length - 1);

		reverse(arr, 0, r);

		reverse(arr, 0, arr.length - 1);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int r = 3;
		rightRotate(arr, r);
		System.out.println(Arrays.toString(arr));
	}
}
