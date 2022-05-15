package com.techiedelight;

import java.util.LinkedList;

/*
 * Given an integer array, move all zeros present in it to the end. 
 * The solution should maintain the relative order of items in the array and should not use constant space.
 * 
 * For example,
 * Input:  { 6, 0, 8, 2, 3, 0, 4, 0, 1 }
 * Output: { 6, 8, 2, 3, 4, 1, 0, 0, 0 }
 * */
public class MovingZeros {

	public static LinkedList<Integer> toLast(int[] arr) {

		LinkedList<Integer> list = new LinkedList<>();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			} else if (arr[i] == 0) {
				count++;
			}
		}

		for (int i = list.size() - 1, j = 1; j <= count; i--, j++) {
			list.add(0);
		}
		return list;
	}

	public static void main(String[] args) {

		int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		System.out.println(toLast(arr));
	}
}
