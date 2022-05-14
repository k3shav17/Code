package com.techiedelight;

import java.util.HashSet;
import java.util.Set;

/*Given an integer array, check if it contains a subarray having zero-sum.

For example,
Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 
Output: Subarray with zero-sum exists
 
The subarrays with a sum of 0 are:
 
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 } */

public class SubArrayWithSum0 {

	public static boolean hasSubArray(int arr[]) {

		Set<Integer> set = new HashSet<Integer>();

		int sum = 0;
		for (int values : arr) {
			sum += values;
			if (set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

		if (hasSubArray(arr)) {
			System.out.println("Exists");
		} else
			System.out.println("does not exists");
	}
}
