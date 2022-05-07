package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 1, 3, 3, 4, 3, 2, 4, 2);

		ContainsDuplicate dupe = new ContainsDuplicate();
		System.out.println(dupe.isDuplicate(list));
	}

//	This is my method
//	public boolean isDuplicate(List<Integer> nums) {
//
//		boolean flag = false;
//
//		for (int i = 0; i < nums.size(); i++) {
//			for (int j = i + 1; j < nums.size(); j++) {
//				if (nums.get(i) == nums.get(j)) {
//					flag = true;
//					break;
//				}
//			}
//		}
//		return flag;
//	}
//	
	public boolean isDuplicate(List<Integer> nums) {

		HashSet<Integer> list = new HashSet<Integer>();

		for (int i = 0; i < nums.size(); i++) {

			if (list.contains(nums.get(i))) {
				return true;
			} else
				list.add(nums.get(i));
		}
		return false;
	}
}
