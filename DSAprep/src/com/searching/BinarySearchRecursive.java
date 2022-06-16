package com.searching;

public class BinarySearchRecursive {

	public boolean recursiveSearch(int[] arr, int x, int left, int right) {

		if (left > right) {
			return false;
		}

		int mid = left + (right - left) / 2;

		if (arr[mid] == x) {
			return true;
		} else if (x > arr[mid]) {
			return recursiveSearch(arr, x, mid + 1, right);
		} else
			return recursiveSearch(arr, x, left, mid - 1);
	}

	public static void main(String[] args) {

		BinarySearchRecursive bsr = new BinarySearchRecursive();
		int[] arr = { 1, 3, 6, 7, 8, 9 };
		int x = 2;
		System.out.println(bsr.recursiveSearch(arr, x, 0, arr.length - 1));

	}
}
