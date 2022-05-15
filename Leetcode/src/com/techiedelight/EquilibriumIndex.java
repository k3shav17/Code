package com.techiedelight;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array, find the equilibrium index in it.
 * For an array A consisting n elements, index i is an equilibrium index,
 * if the sum of elements of subarray A[0…i-1] is equal to the sum of elements of subarray A[i+1…n-1]*/

public class EquilibriumIndex {

	public static List<Integer> equilibrium(int[] arr) {

		List<Integer> indices = new ArrayList<Integer>();
		int sum = 0;
		int right = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			if (right == sum - (arr[i] + right)) {
				indices.add(i);
			}
			right += arr[i];
		}
		return indices;
	}

	public static void main(String[] args) {

		int[] arr = { 0, -3, 5, -4, -2, 3, 1, 0 };
		System.out.println(equilibrium(arr));
	}
}
