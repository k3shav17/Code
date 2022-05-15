package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class RemovingDupes {

	public static Vector<Integer> withoutDupes(int arr[]) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Vector<Integer> vector = new Vector<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(arr[i])) {
				vector.add(arr[i]);
			}
			map.put(i, arr[i]);
		}
		return vector;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 1, 5, 4, 1, 3 };
		System.out.println(withoutDupes(arr));
	}
}
