package com.tejas;

import java.util.LinkedHashMap;
import java.util.Map;

//Write a program to find the most occurrence of a number in the array.

public class MostFrequentNumber {

	public int repeatedTimes(int[] arr) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		int max = 0, res = -1;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (max < entry.getValue()) {
				max = entry.getValue();
				res = entry.getKey();
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 3, 2, 3, 4, 3 };

		MostFrequentNumber mfn = new MostFrequentNumber();
		System.out.println(mfn.repeatedTimes(arr));
	}
}
