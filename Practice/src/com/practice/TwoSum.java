package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 8;

		HashMap<Integer, Integer> sums = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (sums.containsKey(target - arr[i])) {
				list.add(sums.get(target - arr[i]));
				list.add(i);
			}
			sums.put(arr[i], i);
		}
		System.out.println(list);
	}
}
