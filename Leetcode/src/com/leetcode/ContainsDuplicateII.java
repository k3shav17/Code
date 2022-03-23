package com.leetcode;

/*Given an integer array nums and an integer k, 
 * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/
public class ContainsDuplicateII {

	public static void main(String[] args) {

		ContainsDuplicateII dupe = new ContainsDuplicateII();
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		 
		System.out.println(dupe.containsNearbyDuplicate(nums, k));
		
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					if (Math.abs(nums[i] - nums[j]) <= k) {
						flag = true;
					}
				}
			}
		}
		return flag;

	}
}
