package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FrequencySort {

	public static int[] sortedByFrequency(int[] arr) {

		int[] sorted = new int[arr.length];
		Map<Integer, Integer> frequency = new ConcurrentHashMap<>();

		for (int i : arr) {
			frequency.put(i, frequency.getOrDefault(i, 0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequency.entrySet());
		
		Collections.sort(list, (a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue());

		int j = 0;
		for (Map.Entry<Integer, Integer> entry : list) {

			for (int i = 0; i < entry.getValue(); i++) {
				sorted[j++] = entry.getKey();
			}

			frequency.remove(entry.getKey());
		}
		return sorted;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 };
		System.out.println(Arrays.toString(sortedByFrequency(arr)));
	}
}
