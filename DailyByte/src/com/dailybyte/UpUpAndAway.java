package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer array, nums, return whether or not you can make the array strictly non-decreasing by modifying at most one element.
Note: A non-decreasing array is an array in which nums[i] <= nums[i + 1] for every i.

Ex: Given the following nums…

nums = [3, 1, 2], return true (you could modify three to one).

Ex: Given the following nums…

nums = [4, 2, 1, 3], return false.*/
public class UpUpAndAway {

	public static boolean isNonDecreasing(List<Integer> nums) {

		boolean flag = false;
		int count = 0;

		for (int i = 0; i < nums.size() - 1; i++) {

			if (nums.get(i) >= nums.get(i + 1)) {
				count++;
			}
		}
		if (count > 1) {
			flag = false;
		} else
			flag = true;
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		List<Integer> nums = new ArrayList<Integer>();
		System.out.println("enter the elements in to the array");
		for (int i = 0; i < size; i++) {
			nums.add(in.nextInt());
		}

		System.out.println(isNonDecreasing(nums));
		in.close();
	}

}
