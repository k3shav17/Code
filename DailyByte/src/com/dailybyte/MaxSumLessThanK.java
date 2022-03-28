package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer array, nums, return the maximum sum that exists between two elements that is less than k.

Ex: Given the following nums…

nums = [8, 2, 4, 9], k = 13, return 12 (8 + 12 = 12 < 13).

Ex: Given the following nums…

nums = [19, 10, 14, 23, 12], k = 39, return 37.*/

public class MaxSumLessThanK {

	public int secondHighestSum(List<Integer> nums, int target) {

		int secondMax = nums.get(0);
		int tempMax = 0;

		for (int i = 0; i < nums.size(); i++) {

			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) < target) {
					tempMax = nums.get(i) + nums.get(j);
					
					if (tempMax >= secondMax) {
						secondMax = tempMax;
					}
				}
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		System.out.println("Enter the elements into the array, when you are done enter 0");

		List<Integer> nums = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);

		while (true) {

			int element = in.nextInt();

			if (element == 0) {
				break;
			} else
				nums.add(element);
		}

		System.out.println("Enter the max sum target ");

		int target = in.nextInt();

		MaxSumLessThanK second = new MaxSumLessThanK();
		System.out.println(second.secondHighestSum(nums, target));
		in.close();

	}
}
