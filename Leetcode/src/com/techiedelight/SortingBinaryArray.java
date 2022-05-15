package com.techiedelight;
//Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }

import java.util.LinkedList;

//
//Output: { 0, 0, 0, 0, 1, 1, 1, 1 } 

public class SortingBinaryArray {

//	public static int[] sortedBinary(int[] arr) {
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		return arr;
//	}

	public static LinkedList<Integer> sortingWithList(int[] arr) {

		LinkedList<Integer> result = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result.addFirst(0);
			} else
				result.addLast(1);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1 };

//		int[] result = sortedBinary(arr);
//
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + " ");
//		}
		
		System.out.println(sortingWithList(arr));
	}
}
