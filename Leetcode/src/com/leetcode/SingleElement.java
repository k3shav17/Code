package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.*/
public class SingleElement {

	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		int index = 0;
		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		Map<Integer, Integer> valueCount = new HashMap<>();

		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(i) == nums.get(j)) {
					count++;
				}
			}

			valueCount.put(nums.get(i), count);

		}

		Set<Entry<Integer, Integer>> indexCount = valueCount.entrySet();
		Iterator<Entry<Integer, Integer>> it = indexCount.iterator();

		while (it.hasNext()) {

			Entry<Integer, Integer> ele = it.next();

			if (ele.getValue() == 1) {
				index = ele.getKey();
			}
		}
		System.out.println(index);
		in.close();
	}
}
