package com.techiedelight;

import java.util.Arrays;

/*
 * In this post, we will see how to left-rotate an array by specified positions. 
 * For example, left-rotating array { 1, 2, 3, 4, 5 } twice results in array { 3, 4, 5, 1, 2 }.
 * */
public class LeftRotateAnArray {

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

	public static void leftRotate(int[] arr, int r) {

		if (r < 0 || r >= arr.length) {
			return;
		}

		reverse(arr, 0, r - 1); // reversing the elements till index r - 1

		reverse(arr, r, arr.length - 1); // reversing the elements after the index r

		reverse(arr, 0, arr.length - 1); // reversing the whole array
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int r = 2;

		leftRotate(arr, r);
		System.out.println(Arrays.toString(arr));
	}
}
