package com.greedy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array find the majority element.
 * The element which appeared more than n / 2 times. where n = size of the array
 * 
 * */
public class MajorityElement {

	public int manyTimes(int[] arr) {

		int n = arr.length, ans = 0;

		for (int i = 0; i < 32; i++) {
			int ones = 0;
			for (int j = 0; j < arr.length; j++) {
				if (((1 << i) & arr[j]) == 1) {
					ones += 1;
				}
			}
			if (ones > n / 2) {
				ans += (1 << i);
			}
		}
		return ans;
	}
	
	public int bmAlgo(int[] arr) {
		
		Map<Integer, Integer> majority = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			majority.put(arr[i], majority.getOrDefault(arr[i], 0) + 1);
		}
		
		for (Map.Entry<Integer, Integer> entry : majority.entrySet()) {
			if(entry.getValue() > arr.length / 2) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 2, 4, 2, 2 };
		MajorityElement me = new MajorityElement();
		System.out.println(me.bmAlgo(arr));
	}
}
