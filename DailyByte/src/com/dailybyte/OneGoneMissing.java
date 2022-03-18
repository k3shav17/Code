package com.dailybyte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OneGoneMissing {

	public static void main(String[] args) {
		System.out.println("Finding the missing element in an array");
		int[] nums = { 6, 3, 1, 2, 4, 0, 5, 8, 9 };
		Arrays.sort(nums);
		Set<Integer> dupes = new HashSet<>();
		int flag = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				dupes.add(i);
			}
		}
		Iterator<Integer> it = dupes.iterator();
		while (it.hasNext()) {
			flag = it.next();
			System.out.print(flag + " ");
			break;
		}
		System.out.println(
				"is the only number missing between the range of " + nums[0] + " and " + nums[nums.length - 1]);
	}
}
