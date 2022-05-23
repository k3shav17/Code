package com.dailybyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * You are given two integer arrays, nums1 and nums2, and asked to sort them in a particular order. 
 * The elements in nums2 are distinct and all occur within nums1. 
 * Sort the elements of nums1such that the relative ordering of values are the same as nums2. 
 * All elements that don’t appear in nums2 should appear at the end of nums1 in ascending order.
 * Note: It is guaranteed that no value within nums1 and nums2 exceeds one thousand.
 * Ex: Given the following nums1 and nums2…
 * nums1 = [3, 2, 5, 8, 2, 7], nums2 = [7, 8, 3], return [7, 8, 3, 2, 2, 5] 
 * (7, 8, and 3 appear first because of their ordering in nums2 followed by 2 and 5 sorted in ascending order since they don't exist in nums2).
*/
public class SortNumbers {

	public static void sortingBasedOnArr2(int[] arr1, int[] arr2) {

		Map<Integer, Integer> hm = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < arr2.length; i++) {
			hm.put(arr2[i], i);
		}

		for (int i = 0; i < arr1.length; i++) {

			if (hm.containsKey(arr1[i])) {
				for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
					if (entry.getKey() == arr1[i])
						list1.add(entry.getKey());
				}
			} else
				list2.add(arr1[i]);
		}

		Collections.reverse(list1);
		Collections.sort(list2);
		System.out.println(list1 + " " + list2);
	}

	public static void main(String[] args) {

		int[] arr1 = { 3, 2, 5, 8, 2, 7 };
		int[] arr2 = { 7, 8, 3 };

		SortNumbers.sortingBasedOnArr2(arr1, arr2);
	}
}
